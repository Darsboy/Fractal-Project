
/**
 * Write a description of class DragonCurve here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DragonCurve
{
    // instance variables - replace the example below with your own
    private int x;
    Turtle turtle;
    static  double  rootHalf=Math.pow(0.5,0.5);
    /**
     * Constructor for objects of class DragonCurve
     */
    public DragonCurve(double xc,double yc,double angle,int oroder,double length)
    {
        turtle=new Turtle(xc,yc,angle);
        //setCoulor(turtle.getX(),turtle.getY());
        dragonCurveRecursive(oroder,length,1);
    }
	public static void setCoulor(double x,double y){
		int red=Math.max(0,(int) ((x-y)*255)),green=(int) ((1.0-x)*255),blue=(int) ((x*y)*255);
		StdDraw.setPenColor(red,green,blue);
	}
	/**
	 * @param order
	 * @param length-the size
	 * @param sign the sign of the curve dictate the turn
	 */
    public void dragonCurveRecursive(int order, double length,int sign){
    	//
        if(order==0){
            //turtle.turn(-90);
        	setCoulor(turtle.getX(),turtle.getY());
            turtle.drawLine(length);
            return;
        }
        //sign is possitive means turn right negative turn left
        dragonCurveRecursive(order-1,length*rootHalf,1);
        turtle.turn(-sign*90);
        dragonCurveRecursive(order-1,length*rootHalf,-1);
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void main(int degree)
    {
        //StdDraw.setCanvasSize(512,512);
        dragonCurveRecursive(degree,0.5,1);
    }
}
