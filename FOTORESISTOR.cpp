// C++ code
//
int orange_led = 5;
int light_sensor = A0;
int sensor_value = 0;
int red_led = 3;
int piezo = 4;

void setup()
{
  pinMode(orange_led,OUTPUT);
  pinMode(red_led,OUTPUT);
  pinMode(piezo, OUTPUT);
  Serial.begin(8600);
}

void loop()
{
  sensor_value = analogRead(light_sensor);
  Serial.println(sensor_value);
  
  if(sensor_value >= 732)
  {
    digitalWrite(orange_led,HIGH);
    digitalWrite(red_led,LOW);
  }
  else
  {
    digitalWrite(orange_led,LOW);    
    digitalWrite(red_led,HIGH);  
  }    
    delay(10);
}
