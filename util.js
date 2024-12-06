import * as React from 'react';
import { Text, View, StyleSheet, Image } from 'react-native';
import * as Location from 'expo-location'; // Expo Location API: acessa localização

export default class App extends React.Component {
  constructor() {
    super();
    this.state = {
      api:'',
      location: null,
      errorMessage: null,
    };
  }

  async componentDidMount()
  {
    await this.getLocation();
  }

  // Obtendo a localização atual
  getLocation = async () => {
    let {status} = await Location.requestForegroundPermissionsAsync();
    if(status !== 'granted')
    {
      this.setState({errorMessage: "permissão negada"});
      return;
    }
     let location = await Location.getCurrentPositionAsync({});
     this.setState({location},()=>{
       this.pegarDados();
       });
  };

  // Pegando os dados da API com base na localização atual
  pegarDados = async () => { 
    const { latitude, longitude } = this.state.location.coords;
    var link = `https://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&units=metric&APPID=143454aa39bbe3442a890cdbf3f9db36`;
    
    return await fetch(link).then((response)=> response.json()).then((responseJson)=>{
      this.setState({api: responseJson})
    }).catch((erro)=>console.error(erro));
  };

  render() {
    if (!this.state.api) {      
      return (
        <View style = {styles.container}>
        <Text style = {styles.texto}>Loading.......</Text>
        </View>        
      );
    } else {      
      return (
        <View style = {styles.container}>
        <Text style = {styles.title}>Previsão do tempo</Text>
        <Image style = {styles.imagem} source = {require('./clima.png')}/>
        <Text style = {styles.texto}>{this.state.api.name} - {this.state.api.main.temp}°C</Text>
        </View> 
      );
    }
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "orange"    
  },
  title: {
    marginTop: 60,
    fontSize: 31,
    fontWeight:'bold'
  },
  imagem: {
    width: 100,
    height: 100,
    marginTop: 5,

  },
  texto: {
    marginHorizontal: 10,
    fontSize: 31,
    fontWeight:'bold',
    textAlign: 'center'
  },
});
