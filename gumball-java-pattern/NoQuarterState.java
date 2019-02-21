

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.gumballMachine.m = gumballMachine.m;
        
  
    }
    
    public void insertQuarter(int a, int b, int c) {
     
        int numCoins=0, sumCoins=0;
        numCoins = a+b+c;
        sumCoins = 10*a + 1*b + 25*c;
        
        
   
        if (numCoins == 1)
        {
            //gumballMachine.m = 1;
            if (sumCoins == 25)
               {
                   System.out.println("You inserted a quarter");
                   //if (gumballMachine.m == 1)
                   
                        gumballMachine.setState(gumballMachine.getHasQuarterState());
                   /*else
                        System.out.println("Correct amount but wrong machine chosen");*/
                }
                
                
                else
                    System.out.println("Wrong input, please try again");
                }  
        
            
        else if (numCoins == 2)
            {
                //int temp = gumballMachine.m;
                //if(temp!=1)
                //{
                if (sumCoins == 50)
                {
                    System.out.println("You inserted two quarters");
                    gumballMachine.setState(gumballMachine.getHasQuarterState());
                }
                else
                    System.out.println("Wrong input, please try again");
                /*}
                else
                    System.out.println("Correct amount but wrong machine chosen");*/
            }
            else if (numCoins > 2)
            {
                //int temp = gumballMachine.m;
                //if ((temp!=1)&&(temp!=2))
                //{
                if (sumCoins == 50)
                {
                    System.out.println("You inserted 50 cents");
                    gumballMachine.setState(gumballMachine.getHasQuarterState());
                }
            /*}
            else
            System.out.println("Correct amount but wrong machine chosen");*/
        }
               else
                System.out.println("Wrong input, please try again");
            
         
            
        
        
            //else
              //  System.out.println("Wrong input, please try again");
            
            //System.out.println("You inserted two quarters");
            //gumballMachine.setState(gumballMachine.getHasQuarterState());
                
            
        
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
