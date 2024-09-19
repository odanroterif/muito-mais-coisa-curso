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
//-----------------------------
    
  
void setup()
{
  pinMode(red_led,OUTPUT);
  pinMode(second_red_led,OUTPUT);
  pinMode(piezo, OUTPUT);
  pinMode(white_led,OUTPUT);
  pinMode(piezo_two_led,OUTPUT);
  pinMode(piezo,OUTPUT);    
  pinMode(button,INTPUT);
  pinMode(pir_sensor,INTPUT);
  Serial.begin(9600);
}

void loop()
{
  sensor_value = analogRead(light_sensor);
  potenciometro_value = analogRead(potenciomentro_position);
  pir_sensor_state = analogRead(pir_sensor);
}
