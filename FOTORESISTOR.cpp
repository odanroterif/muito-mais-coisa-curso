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
//keypad variables-------------
const int line = 4;
const int column = 4;
int line_pins[line] = {7,10,11,12};
int column_pins[column] = {A5,A4,A3,13};
char keypad[line][column] = {
  {'0','1','2','3'},
  {'4','5','6','7'},
  {'8','9','A','B'},
  {'C','D','E','F'}
};
//Keypad customKeypad = Keypad(makeKeymap(keypad),line_pins,column_pins,line,column); 
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
  pir_sensor_state = analogRead(pir_sensor);
  int condition = digitalRead(white_led);
  String password = "2468";
  
  Serial.println(potenciometro_value);
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
  }
}
