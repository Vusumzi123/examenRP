'use strict';
const controller = require('./controller');
module.exports = function(app){
    app.route('/services/generaRFC')
        .post(controller.generaRFC);

    app.route('/services/registros')
        .get(controller.registros);
}