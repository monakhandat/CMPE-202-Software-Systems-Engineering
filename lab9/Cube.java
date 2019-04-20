
/**
 * Write a description of class Cube here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cube implements IStrategyPattern
{
    // instance variables - replace the example below with your own
    private int data;

    /**
     * Constructor for objects of class Cube
     */
    public Cube(int a)
    {
        // initialise instance variables
        data = a;
    }

    public int calculation(int data) {
		// TODO Auto-generated method stub
		//System.out.println("Printing cube");
		return data*data*data;
	}
}
