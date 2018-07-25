const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');

const app = express();
const port = process.env.PORT || 3000;

app.use(bodyParser.urlencoded({extended:true}));
app.use(bodyParser.json());
app.use(cors());

const routes = require('./routes')
routes(app);

try {
    app.listen(port);
    console.log('RESTful API server started on: '+port);
    
} catch (error) {
    console.log(error);
    
}