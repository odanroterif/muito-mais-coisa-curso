const axios = require('axios');
const url = "https://jsonplaceholder.typicode.com/todos/1";
const url2 = "https://jsonplaceholder.typicode.com/posts";
//blackboxai ,, monokai pro ,, error lens
//GET---------------

axios.get(url).then(response => {
    console.log(response.data);
    }).catch(error => {
        console.error("erro ao acessar dados de API: ",error);
});

//POST--------------

axios.post(url2,{userId: 1,title: "api post é -46 graus abaixo da temperatura ambiente",completed: false})
    .then(response => {
    console.log(response.data);
    }).catch(error => {
        console.error("erro ao acessar dados de API: ",error);
})