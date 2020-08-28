public class Longsquare {
    public static void main(String[] args) {
        Rect l1 = new Rect(9, 0); 
        Rect r1 = new Rect(0, 9); 
        Rect l2 = new Rect(0, 15); 
        Rect r2 = new Rect(15, 0); 
        
        Rectangle first = new Rectangle(l1, r1);
        Rectangle second = new Rectangle(l2, r2); 
        
        if (first.isOverLapping(second)) 
        { System.out .println("Yes, two rectangles are intersecting with each other"); } 
        else { System.out .println("No, two rectangles are not overlapping with each other"); 
            
        } 
        
    }
    }
    
class Rect { 
    int x; 
    int y;
    
    public Rect(
        int x, int y) { super(); this.x = x; this.y = y; 
            
        } 
    
}
class Rectangle {
    private final Rect topLeft;
    private final Rect bottomRight; 
    public Rectangle(Rect topLeft, Rect bottomRight) { 
        this.topLeft = topLeft; this.bottomRight = bottomRight; }

public boolean isOverLapping(Rectangle other) { if (this.topLeft.x > other.bottomRight.x| this.bottomRight.x < other.topLeft.x| this.topLeft.y < other.bottomRight.y| this.bottomRight.y > other.topLeft.y) {return false;
  }
  return true;
  }

}
