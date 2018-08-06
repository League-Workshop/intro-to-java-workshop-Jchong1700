PImage cave;
PImage dragon;

void setup(){
  cave = loadImage("cave.jpg");
  size(800,600);
  cave.resize(width,height);
  dragon=loadImage("dragon.png");
  dragon.resize(600,500);
  
}
void draw(){ background(cave);
image(dragon, 125, 100);
}