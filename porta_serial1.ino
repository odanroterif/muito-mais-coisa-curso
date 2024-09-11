// C++ code
//
int green_led = 2;
int white_led = 3;
int second_green_led = 4;
int piezo = 5;
int blue_led = 6;

void setup()
{
  pinMode(green_led, OUTPUT);
  pinMode(white_led, OUTPUT);
  pinMode(second_green_led, OUTPUT);
  pinMode(piezo, OUTPUT);
  pinMode(blue_led, OUTPUT);
  Serial.begin(8000);
}

void loop()
{
  if(Serial.read() == 'a')
  {
    digitalWrite(green_led,HIGH);
    digitalWrite(second_green_led,LOW);
    digitalWrite(white_led, LOW);
    digitalWrite(piezo,LOW);
  }
  else if(Serial.read() == 'b')
  {
    digitalWrite(green_led,LOW);
    digitalWrite(second_green_led,LOW);
    digitalWrite(white_led, HIGH);
    digitalWrite(piezo,LOW);
  }   
  else if(Serial.read() == 'c')
  {
    digitalWrite(green_led,LOW);
    digitalWrite(second_green_led,HIGH);
    digitalWrite(white_led, LOW);  
    digitalWrite(piezo,LOW);
  } 
  else if(Serial.read() == 'd')
  {
    digitalWrite(green_led,HIGH);
    digitalWrite(second_green_led,HIGH);
    digitalWrite(white_led, HIGH);  
    digitalWrite(piezo,HIGH);
    delay(150);
    digitalWrite(piezo,LOW);
    delay(150);
    digitalWrite(piezo,HIGH);
    delay(150);
    digitalWrite(piezo,LOW);
    delay(150);
    digitalWrite(piezo,HIGH);
    delay(150);
    digitalWrite(piezo,LOW);
    delay(150);
    digitalWrite(piezo,HIGH);
  } 
  else if(Serial.read() == 'L')
  {
    sing_leds();
  }
}



void sing_leds()
{  
  digitalWrite(white_led,LOW);
  digitalWrite(second_green_led,LOW);
  digitalWrite(green_led,HIGH);
  delay(200);
  digitalWrite(green_led,LOW);
  digitalWrite(white_led,HIGH);
  delay(200);  
  digitalWrite(white_led,LOW);
  digitalWrite(second_green_led,HIGH);
  delay(200);
  digitalWrite(second_green_led,LOW);
  digitalWrite(white_led,HIGH);
  delay(200);
  digitalWrite(white_led,LOW);
  delay(200);
  digitalWrite(white_led,HIGH);
  delay(200);
  digitalWrite(white_led,LOW);
  delay(200);
  digitalWrite(white_led,HIGH);
  digitalWrite(green_led,HIGH);
  digitalWrite(second_green_led,HIGH);
  delay(1000);
  digitalWrite(white_led,LOW);
  digitalWrite(green_led,LOW);
  digitalWrite(second_green_led,LOW);
  delay(500);
  digitalWrite(green_led,HIGH);  
  digitalWrite(second_green_led,HIGH);
  delay(300);
  digitalWrite(green_led,LOW);
  digitalWrite(second_green_led,LOW);
  digitalWrite(white_led,HIGH);
}





