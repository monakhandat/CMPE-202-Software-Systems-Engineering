package lab6;

public class PackagingSlip implements PrintingInterface {
	@Override
	public void printReceipt(Order order)
	{
		System.out.println("Order Number: " + order.orderNum);
		System.out.println("     " + order.date1 + "\t" + order.time1);
		System.out.println("\t   FIVE GUYS");
		
		for (ItemsInOrder item : order.items) 
		{
            System.out.println(item.itemName);
            if((item.patty == "Bacon") || (item.patty == "HAM") || (item.patty == "BEEF"))
            {
            	for (String topping: item.topBunT)
            		System.out.println(topping);
            	for (String topping: item.pattyT)
            		System.out.println("->| " + topping);
            	System.out.println("{{{{ "+ item.patty +"}}}}");
            }
            else
            	continue;
        }
	}
}