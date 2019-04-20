
/**
 * Write a description of class StrategyWithLambda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.List;

public class StrategyWithLambda {

	/**
	 * @param args
	 * @param data 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<IStrategyPattern> strategies = 
			      Arrays.asList(
			        (data) -> { return data*data;},
			        (data) -> {return data*data*data;}
			      );
		strategies.forEach((strat) -> System.out.println(strat.calculation(10)));

	}

}
