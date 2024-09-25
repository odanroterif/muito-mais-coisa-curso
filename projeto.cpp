#include <Keypad.h>

// C++ code
//
int piezo = 2;
int piezo_two = 3;
int red_led = 4;
int second_red_led = 6;
int white_led =  5;
int light_sensor = A0;
int sensor_value = 0;
int button = 8;
int pir_sensor = 9;
int pir_sensor_state = 0;
int potenciomentro_position = A1;
int potenciometro_value = 0;
int button_state = 0;
String password = "";
//keypad variables-------------
const byte line = 4;
const byte column = 4;
byte line_pins[line] = {7,10,11,12};
byte column_pins[column] = {A5,A4,A3,13};
char keipad[line][column] = {
  {'1','2','3','A'},
  {'4','5','6','B'},
  {'7','8','9','C'},
  {'*','0','#','D'}
};
Keypad keypad = Keypad(makeKeymap(keipad),line_pins,column_pins,line,column); 
//-----------------------------
    
  
void setup()
{
  pinMode(red_led,OUTPUT);
  pinMode(second_red_led,OUTPUT);
  pinMode(piezo, OUTPUT);
  pinMode(white_led,OUTPUT);
  pinMode(piezo_two,OUTPUT);
  pinMode(piezo,OUTPUT);    
  pinMode(button,INPUT);
  pinMode(pir_sensor,INPUT);
  Serial.begin(9600);
}

void loop()
{
  button_state = digitalRead(button);
  sensor_value = analogRead(light_sensor);
  potenciometro_value = analogRead(potenciomentro_position);
  pir_sensor_state = digitalRead(pir_sensor);
  int condition = digitalRead(white_led);
  char read = keypad.getKey();
  
  
  //Serial.println(sensor_value);
  //botão
  if(button_state == HIGH && condition == 0)
  {    
    digitalWrite(white_led,HIGH);
  }  
  else if (button_state == HIGH && condition == 1)
  {    
    digitalWrite(white_led,LOW);
  }
  //potenciomentro
  if(potenciometro_value >= 400 && potenciometro_value <= 500)
  { 
    piezo_sequence();
  }
  else
  {
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,LOW);
  }
  //fotoresistor
  if(sensor_value > 130)
  { 
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,LOW);
    digitalWrite(red_led,LOW);
    digitalWrite(second_red_led,LOW);
  }
  else
  {
     digitalWrite(piezo_two,HIGH);
     digitalWrite(piezo,HIGH);     
     digitalWrite(red_led,HIGH);
     digitalWrite(second_red_led,HIGH);
     delay(800);
     digitalWrite(piezo_two,LOW);
     digitalWrite(piezo,LOW);
     digitalWrite(red_led,LOW);
     digitalWrite(second_red_led,LOW);
     delay(800);
  }
  //sensor de movimento
  if(pir_sensor_state == HIGH)
  {
    digitalWrite(piezo_two,HIGH);
    digitalWrite(piezo,HIGH);
    digitalWrite(red_led,HIGH);
    digitalWrite(second_red_led,HIGH);
    delay(1000);
  }
  else 
  {    
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,LOW);
    digitalWrite(red_led,LOW);
    digitalWrite(second_red_led,LOW);
  }
  //keypad 14910
  if(keypad.getState() == PRESSED)
  {
     if(keypad.isPressed('5'))
     {
        digitalWrite(piezo_two,LOW);
        digitalWrite(piezo,LOW);
        digitalWrite(red_led,LOW);
        digitalWrite(second_red_led,LOW);
        digitalWrite(white_led,HIGH);
     } 
     else if(!keypad.isPressed('5'))
     {
       digitalWrite(piezo_two,HIGH);
       digitalWrite(piezo,HIGH);
       digitalWrite(red_led,HIGH);
       digitalWrite(second_red_led,HIGH);
       delay(1000);
       digitalWrite(piezo_two,LOW);
       digitalWrite(piezo,LOW);
       digitalWrite(red_led,LOW);
       digitalWrite(second_red_led,LOW);
     }     
  } 
}
void piezo_sequence()
{
    digitalWrite(piezo,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(2500);  
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(2500);    
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(2500);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(2500);//123 + 1234x2^
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(400);
    digitalWrite(piezo_two,LOW);
    delay(400);
    digitalWrite(piezo_two,HIGH);
    delay(400);
    digitalWrite(piezo_two,LOW);
    delay(400);
    digitalWrite(piezo_two,HIGH);
    delay(400);//12333^
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(400);
    digitalWrite(piezo_two,LOW);
    delay(400);
    digitalWrite(piezo_two,HIGH);
    delay(400);
    digitalWrite(piezo_two,LOW);
    delay(400);
    digitalWrite(piezo_two,HIGH);
    delay(400); //123444^
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(2500);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,HIGH);
    delay(300);
    digitalWrite(piezo,LOW);
    digitalWrite(piezo_two,HIGH);
    delay(300);
    digitalWrite(piezo_two,LOW);
    delay(100);
    digitalWrite(piezo_two,HIGH);
    digitalWrite(piezo,HIGH);
    delay(2500);//123 + 1234^
    digitalWrite(piezo_two,LOW);
    digitalWrite(piezo,LOW);
    delay(5500);
}
