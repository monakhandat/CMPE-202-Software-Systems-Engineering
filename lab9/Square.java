
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square implements IStrategyPattern
{
    int data;
    public Square(int a)
    {
        // initialise instance variables
        data = a;
    }

    public int calculation(int data) {
		// TODO Auto-generated method stub
		//System.out.println("printing square");
		return data*data ;

	}
}
