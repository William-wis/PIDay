String [] piLines;
String piDigits;
long numDigits;
String bDay = "01/01/2007";
String us [];
String uk [];
void setup() {
  size(200, 200);
  noLoop();
  piLines = loadStrings("pi-tenmillion.txt");
  piDigits = piLines[0].substring(0,1) + piLines[0].substring(2);
  MyPI.setPI(piDigits);
  numDigits = piDigits.length();
  us = MyPI.getSubs(bDay);
  for (String q : us) {
    println(q + " " + MyPI.findinPI(q));
  }
  
  String bDay_uk = bDay.substring(3,5) + "/" + bDay.substring(0,3)
  + "/" + bDay.substring(6);
  uk = MyPI.getSubs(bDay_uk);
  for (String q : uk) {
    println(q + " " + MyPI.findinPI(q));
  }
}

void draw() {
}
