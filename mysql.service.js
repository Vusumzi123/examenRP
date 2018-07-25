'use strict';
const mysql = require('mysql2');
const mysql2 = require('mysql2/promise');


exports.create = function(user){
    const con = mysql.createConnection({
        host: 'localhost',
        user: 'root',
        password: 'password',
        database: 'red_point'
    })
    con.connect(function(err){
        if(err) throw err;
        console.log("Conectado a bd");
        const sql = `INSERT INTO examen (nombres, apellidoP, apellidoM, fechaNacimiento, cp, rfc) VALUES ('${user.nombres}', '${user.apellidoP}', '${user.apellidoM}', '${user.fechaNacimiento}', '${user.cp}', '${user.rfc}' )`;
        con.query(sql, function(err, result){
            if(err) throw err;
            console.log("1 registro insertado");
            con.destroy();
        })
    })
}

exports.readAll = async function(){
    const con = await mysql2.createConnection({
        host: 'localhost',
        user: 'root',
        password: 'password',
        database: 'red_point'
    })
    const sql = "SELECT * from examen";
    var [rows, fields] = await con.execute(sql);
    
    return rows;
}