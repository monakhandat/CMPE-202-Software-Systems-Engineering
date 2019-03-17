package lab6;
import java.util.ArrayList;
import java.util.List;

public class Order {
	int orderNum;
	String date1;
	String time1;
	double total1;
	List<ItemsInOrder> items = new ArrayList<ItemsInOrder>();
	/**Constructor**/

	public Order(String date12, String time12, int orderNum2) {
		this.total1 = 0;
        this.date1 = date12;
        this.time1 = time12;
        this.orderNum = orderNum2;
	}
	/** Setting order**/
	void settingInOrder(List<ItemsInOrder> items)
	{
        this.items = items;
    }
	/** Getting sub total before taxes **/
    double getTotal1()
    {
        for (ItemsInOrder i: items)
        {
            this.total1 = this.total1 + i.total1;
        }
        return this.total1;
    }
}