void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍


//Creature's feet
triangle(83, 315, 95, 361, 125, 331)
triangle(135, 329, 161, 361, 179, 315)

//body circles

  ellipse(200, 50, 100, 100)
 ellipse(140, 130, 100, 100)
  ellipse(130, 255, 150, 150)

  //spikes
  
  line(157, 25, 122, 36)
 line(122, 36, 151, 56)
line(151, 56, 124, 69)
  line(124, 69, 136, 82)
 line(136, 82, 64, 102)
	line(64, 102, 92, 121 )
line(92, 121, 64, 139)
line(64, 139, 95, 150)
line(95, 150, 66, 168)
line(66, 168, 98, 188)
line(211, 15, 231, 24)

//eye color
fill(100, 0, 0)

ellipse(226, 33, 10, 10)

//creatures body
fill(0, 0, 100)
}

