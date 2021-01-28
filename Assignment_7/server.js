var express = require('express');
var app = express();

app.use(express.static(__dirname));

// app.use('/Assignment_1/', express.static(__dirname + './Assignment_1'));

app.listen(5000, () => {
    console.log('Server started!');
});