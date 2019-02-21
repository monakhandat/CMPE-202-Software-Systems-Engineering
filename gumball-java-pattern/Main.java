

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(1,5);
		GumballMachine gumballMachine2 = new GumballMachine(2,10);
		GumballMachine gumballMachine3 = new GumballMachine(3,15);
		

		
		System.out.println(gumballMachine1);
		System.out.println(gumballMachine2);
		System.out.println(gumballMachine3);
		

		gumballMachine1.insertQuarter(0,0,1);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);
		
		gumballMachine1.insertQuarter(0,0,1);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);


		gumballMachine3.insertQuarter(5,0,0);
		gumballMachine3.turnCrank();
		System.out.println(gumballMachine3);
		
		gumballMachine2.insertQuarter(0,0,2);
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		
		gumballMachine2.insertQuarter(0,0,2);
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		
		gumballMachine1.insertQuarter(0,0,1);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

	}
}
