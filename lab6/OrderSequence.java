package lab6;

public class OrderSequence
{
	private PrintingInterface printingStrategy;
	/** Constructor **/
	public OrderSequence(PrintingInterface printingStrategy)
	{
	    this.printingStrategy = printingStrategy;
	}
	public void executePrinting(Order order)
    {
        printingStrategy.printReceipt(order);
    }
}