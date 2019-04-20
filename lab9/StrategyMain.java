
/**
 * Write a description of class StrategyMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.List;
public class StrategyMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a = 10;
		List<IStrategyPattern> calculations = 
		        Arrays.asList(
		          new Square(a), 
		          new Cube(a)
		        );
		for (IStrategyPattern calc : calculations) 
		{
		      System.out.println(calc.calculation(10));
		}
	}

}