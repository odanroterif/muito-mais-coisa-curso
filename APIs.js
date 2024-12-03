const axios = require('axios');
const prompt = require('prompt-sync')({sigint:true});
const url = "https://jsonplaceholder.typicode.com/todos/1";
const url2 = "https://jsonplaceholder.typicode.com/posts";
const url3 = "https://jsonplaceholder.typicode.com/posts/1";
//Atom Material Icons


console.log("1- receber dados\n2- inserir dados\n3- atualizar dados\n4- deletar dados");
var resward = prompt("Escolha uma opção: ");

switch(resward)
{
    case "1":
        axios.get(url).then(response => {
            console.log(response.data);
            }).catch(error => {
                console.error("erro ao acessar dados de API: ",error);
        });
        break;
    case "2":
        axios.post(url2,{userId: 1,title: "api post é -46 graus abaixo da temperatura ambiente",completed: false})
    .then(response => {
    console.log(response.data);
    }).catch(error => {
        console.error("erro ao acessar dados de API: ",error);
        });
        break;
    case "3":
        axios.put( 
            url3,
            {
                "title": "foo",
                "body": "bar",
                "userId": 1
                }                               
        )
        .then(response => {
            console.log("atualização realizada com sucesso");
            console.log(response.data);    
            })
            .catch(error => {
                console.error(error);
                });  
                break;                                
    case "4":
        axios.delete(url3, {
        })
        .then(response => {
            console.log("dados deletados");            
            console.log(response.data);  
            console.log(response.status);
            })
            .catch(error => {
                console.error(error);                
                });     
                break;            
    default:
        console.log("opção inválida");
}