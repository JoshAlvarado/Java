// TODO - write your code below this comment.
// As a hint, You will need to make RectangleWithArea inherit
// from Rectangle, and you'll need to use super in the constructor.
   public class RectangleWithArea extends Rectangle{
   public RectangleWithArea(int width, int height){  
      super(width,height);
      } 
   public int getArea(){
      return getWidth()*getHeight(); 
      }
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        RectangleWithArea r =
            new RectangleWithArea(Integer.parseInt(args[0]),
                                  Integer.parseInt(args[1]));
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Area: " + r.getArea());
    }
}
