// C++ code
//wesley
int piezo = 4;
void setup()
{
  pinMode(piezo,OUTPUT);
}

void loop()
{
  digitalWrite(piezo,HIGH);
  delay(600);
  digitalWrite(piezo,LOW);
  delay(600);
  digitalWrite(piezo,HIGH);
  delay(2000);
  digitalWrite(piezo,LOW);
  delay(600);
}
