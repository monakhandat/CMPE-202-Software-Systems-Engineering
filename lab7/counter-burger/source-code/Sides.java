
/**
 * Write a description of class Sides here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sides extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options;

    /**
     * Constructor for objects of class Sides
     */
    public Sides(String d)
    {
        // initialise instance variables
        super(d);
    }
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            this.price += 3.00 ;
            if("No Side".equals(options[i]))
                this.price -= 3.00 ;
        }
        
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}
