package lab6;

public class ItemsInOrder {

	String itemName;
	int quantity;
	double eachPrice;
	public double total1;
	String patty;
	String[] pattyT;
	String[] topBunT;
	/**Constructor**/
	ItemsInOrder()
	{
	}
	public ItemsInOrder(String itemName2, int quantity2, double eachPrice2) {
		// TODO Auto-generated constructor stub
		this.itemName = itemName2;
		this.quantity = quantity2;
		this.eachPrice = eachPrice2;
		this.total1 = quantity * eachPrice;
	}
	/** Set toppings on Top Bun **/

    /** Set Patty on bottom bun **/
    public void setPatty(String patty){
        this.patty = patty;
    }
	/** Set toppings on Bottom Bun over Patty **/
    public void setToppingsOnPatty(String[] pattyT)
    {
        this.pattyT = pattyT;
    }
	public void setToppingsOnTopBun(String[] topBunToppings) {
		// TODO Auto-generated method stub
		this.topBunT = topBunToppings;
	}	
}