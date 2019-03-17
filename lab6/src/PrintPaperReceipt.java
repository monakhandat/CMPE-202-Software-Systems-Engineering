package lab6;

public class PrintPaperReceipt implements PrintingInterface {
	@Override
	public void printReceipt(Order order)
	{
		double grandTotal, Taxes;
		System.out.println("\t   FIVE GUYS");
		System.out.println("\tBURGERS AND FRIES");
		System.out.println("\tSTORE # CA-1294");
		System.out.println("\t5353 ALMADEN EXP N60");
		System.out.println("\tSAN JOSE, CA 95118");
		System.out.println("\t(P) 408-264-9300");
		System.out.println("\n");
		System.out.println("     " + order.date1 + "\t" + order.time1);
		System.out.println("\t   FIVE GUYS");
        System.out.println("Order Number: \t" + order.orderNum);
        
        for (ItemsInOrder item : order.items) 
        {
            System.out.println(item.itemName + "\t\t" + item.total1);
            if((item.patty == "Bacon") || (item.patty == "HAM") || (item.patty == "BEEF"))
            {	
            	System.out.println("{{{{ "+ item.patty +"}}}}");
            	for (String topping: item.topBunT)
            		System.out.println(topping);
            	for (String topping: item.pattyT)
            		System.out.println("->| " + topping);
            	System.out.println("");
            }
            else
            	continue;
        }
        System.out.println("Sub. Total:\t" + String.format("%.2f", order.getTotal1()));
        grandTotal = 1.09 * order.getTotal1();
        Taxes = 0.09 * order.getTotal1();
        System.out.println("Tax:\t\t" + String.format("%.2f", Taxes));
        System.out.println("Total:\t\t" + String.format("%.2f", grandTotal));
        System.out.println("\n");
    }
}