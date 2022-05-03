import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(54, 32, 5);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    if(keyPressed) {	
    // purple background   
    if (key == '1') {
      background(255, 165, 38);
    } 
    // blue background
    else if (key == '2') {
      background(0, 5, 46);
    } 
    // orange background
    else if (key == '3') {
      background(0, 5, 46);
    }
  } 

    //declare flower variables
    
    float randomFlowerX = random(0, 400);
    float randomFlowerY = random(0, 400);
    float petalDiameter = random(20, 100);
    float petalDistance = petalDiameter / 2;

    //make water droplet on mouse
    //background(32);
    
    //fill(3, 48, 252);
    //ellipse(mouseX, mouseY, 20, 20);
    
      if (mousePressed) {
    //flower(mouseX, mouseY, petalDiameter /3 ,  petalDistance /3);
    //ground((0), (float) (height / 1.6), (width), (height));

    //Drawing house 
  
    ground((0), (float) (height / 1.6), (width), (height));
    base((float) (width/4), (float) (height/2), (float) (width/4), (float) (height/4));
    door((float) (width/3.33), (float) (height*.65), (float) (width/16), (float) (height/10));
    window((float) (width/3.33), (float) (height/1.818), (float) (width/6.666), (float) (height/13.33));
    roof((float) (width/4), (float) (height/2), (float) (width/2), (float) (height/2), (float) (width/2.66), (float) (height/2.5));



    
  } 

    }


  public void mouseDragged(){
    
    //make a sun

    
    fill(252, 227, 3);
    ellipse((float) (width/1.333), (float) (height*.175), (float) (width/5), (float) (height/5));

  /*
  void flower(float randomFlowerX, float randomFlowerY, float petalDiameter, float petalDistance) {
  //float petalDistance = petalSize / 2;

  fill(300, 50, 20);

            // upper left petal
    fill(230, 0, 255);
    ellipse(randomFlowerX - petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // upper right petal
    fill(230, 0, 255);
    ellipse(randomFlowerX + petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // bottom left petal
    fill(230, 0, 255);
    ellipse(randomFlowerX - petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);

    // bottom right petal
    fill(230, 0, 255);
    ellipse(randomFlowerX + petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);
    
    // center of flower
    fill(168, 111, 54);
    ellipse(randomFlowerX, randomFlowerY, petalDiameter, petalDistance * 2);

    */
}

    /** 
    Method for ground
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/
    public void ground(float X1, float Y1, float X2, float Y2){
      fill(18,74,19);
      stroke(200);    
      rect(X1, Y1, X2, Y2);
      }
  
    /**Method for house base
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/

    public void base(float X1, float Y1, float X2, float Y2){
      fill(110, 31, 31);
      rect(X1, Y1, X2, Y2);
    }
    /**Method for door
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/
    public void door(float X1, float Y1, float X2, float Y2){
      fill(166,86,2);
      rect(X1, Y1, X2, Y2);
      }

    /**Method for window
    @param X1 for horizontal coordinate
    @param Y1 for vertical coordinate
    @param X2 for horzontal size
    @param Y2 for vertical size
    **/
    public void window(float X1, float Y1, float X2, float Y2){
      fill(245, 230, 215);
      rect(X1, Y1, X2, Y2);
      }

    /**Method for roof
    @param X1 for first horizontal coordinate
    @param Y1 for first vertical coordinate
    @param X2 for second horizontal coordinate
    @param Y2 for second vertical coordinate
    @param X3 for third horizontal coordinate
    @param Y3 for third vertical coordinate
    **/
    public void roof(float X1, float Y1, float X2, float Y2, float X3, float Y3){
      fill(135, 34, 27);
      triangle(X1, Y1, X2, Y2, X3, Y3);
      }


}