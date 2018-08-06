PImage mustache;
PImage MrClean;
void setup() { MrClean = loadImage ("MrClean.jpg");
size(800,600);
MrClean.resize(width, height);
mustache = loadImage("mustache.png");
 
}

void draw() { background(MrClean);
if(mousePressed) {
 
image(mustache, mouseX, mouseY);}

}