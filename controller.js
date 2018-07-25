'use strict';
var User = require('./user.model');
const mysqlService = require('./mysql.service');

exports.generaRFC = function(req, res){
    let user = new User();
    user.nombres = req.body.nombres;
    user.apellidoP = req.body.apellidoP;
    user.apellidoM = req.body.apellidoM;
    user.fechaNacimiento = req.body.fechaNacimiento;
    user.cp = req.body.cp;
    user.rfc = user.apellidoP.slice(0,2).toUpperCase() +
                user.apellidoM.slice(0,1).toUpperCase()+
                user.nombres.slice(0,1).toUpperCase()+
                (user.fechaNacimiento.split('/')[0].length<2? "0"+user.fechaNacimiento.split('/')[0].length : user.fechaNacimiento.split('/')[0]) +
                (user.fechaNacimiento.split('/')[1].length<2? "0"+user.fechaNacimiento.split('/')[1].length : user.fechaNacimiento.split('/')[1]) +
                user.fechaNacimiento.split('/')[2].slice(2, 4);

    try {
        mysqlService.create(user); 
    } catch (error) {
        console.log(error);
    }

    res.send(user.rfc);
}

exports.registros = async function(req, res){
    try{
        var rows = await mysqlService.readAll();
        res.json(rows);
    } catch(error){
        console.log(error);
    }
}