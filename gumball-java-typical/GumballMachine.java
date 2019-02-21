
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    
    public void insertMoney(int numDimes, int numNickels, int numQuarters)
    {
        int sumCoins = 0, numCoins = 0;
        numCoins = numDimes + numNickels + numQuarters ;
        sumCoins = 10*numDimes + 1*numNickels + 25*numQuarters ;
        if (numCoins == 1)
        {
            if ((sumCoins == 25) && (numQuarters == 1))
                this.has_quarter = true;
            else
                this.has_quarter = false;
            }
        else if (numCoins == 2)
        {
            if (numQuarters == 2)
                this.has_quarter = true;
            else
                this.has_quarter = false;
            }
        else if (numCoins > 2)
        {
            
            if (sumCoins == 50)
                this.has_quarter = true;
            else
                this.has_quarter = false;
            }
    }
    
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert appropriate amount of money" ) ;
        }        
    }
}
