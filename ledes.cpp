// C++ code
//Franklin Douglas Williamas Júnior
int potenciomentro_position = A3;
int potenciometro_value = 0;
int red_led = 3;
int orange_led = 5;
int green_led = 6;
int second_green_led = 9;


void setup()
{  
  Serial.begin(9600);
  pinMode(red_led, OUTPUT);
  pinMode(orange_led, OUTPUT);
  pinMode(green_led, OUTPUT);
  pinMode(second_green_led, OUTPUT);
}

void loop()
{    
  potenciometro_value = analogRead(potenciomentro_position);
  Serial.println(potenciometro_value);
  //red
  if(potenciometro_value >= 532)
  {
    digitalWrite(red_led,HIGH);
  }
  else
  {
    digitalWrite(red_led,LOW);
  } 
  //green
  if(potenciometro_value == 20)
  {
    digitalWrite(green_led,HIGH);
  }
  else
  {
    digitalWrite(green_led,LOW);
  } 
  //second green
  if(potenciometro_value >= 300 && potenciometro_value < 700)
  {
    digitalWrite(second_green_led,HIGH);
  }
  else
  {
    digitalWrite(second_green_led,LOW);
  } 
  //orange
  if(potenciometro_value >= 801)
  {
    digitalWrite(orange_led,HIGH);
  }
  else
  {
    digitalWrite(orange_led,LOW);
  } 
  delay(10);
}
