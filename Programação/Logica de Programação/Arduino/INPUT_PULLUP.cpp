void setup () {
	Serial.begin(9600);
	pinMode(13, INPUT_PULLUP);
}

void loop() {
	int estado = digitalRead(13);
	Serial.println(estado);
	delay(500);
}