package lab6;
import java.util.ArrayList;
import java.util.List;


public class OrderMain {
	public static void main(String[] args)
	{
		Order order = new Order("12/1/2016", "1:46:54 PM", 45);
		List<ItemsInOrder> itemsInOrder = new ArrayList<>();
		ItemsInOrder item1 = new ItemsInOrder("LBB", 1, 5.59);
		ItemsInOrder item2 = new ItemsInOrder("LTT CAJ", 1, 2.79);
		
		String[] topBunToppings = {"Lettuce", "Tomato"};
		String[] pattyToppings = {"G Onion", "JALA Grilled"};
		
		item1.setToppingsOnPatty(pattyToppings);
		item1.setPatty("Bacon");
		item1.setToppingsOnTopBun(topBunToppings);
		
		itemsInOrder.add(item1);
		itemsInOrder.add(item2);
		System.out.println(itemsInOrder.toString());
        order.settingInOrder(itemsInOrder);

        System.out.println("Receipt-");
        OrderSequence orderSequence = new OrderSequence(new PrintPaperReceipt());
        orderSequence.executePrinting(order);

        System.out.println("\nPacking Slip-");
        orderSequence = new OrderSequence(new PackagingSlip());
        orderSequence.executePrinting(order);
	}

}