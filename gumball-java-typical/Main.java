

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(3);

		System.out.println(gumballMachine);

		//In the function, add number of coins of each type in the sequence of dimes, nickels and quarters.
		gumballMachine.insertMoney( 2, 5, 1 );
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertMoney( 0, 50, 0 );
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertMoney( 0, 0, 1 );
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		
		gumballMachine.insertMoney( 0, 0, 2 );
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);



	}
}
