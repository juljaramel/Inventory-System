package finalProjecct;
import java.util.ArrayList;

public class Item {
	public static ArrayList<Item> ItemList = new ArrayList<Item>();
	
	private int ItemNumber;
	private String ItemCode;
	private String ItemName;
	private int ItemQuantity;
	private double ItemPrice;
	private boolean isAvailable = true;
	
	public void setItemNuber(int iNum) {
		this.ItemNumber = iNum;
	}
	public void setItemCode(String iCode) {
		this.ItemCode = iCode;
	}
	public void setItemName(String iName) {
		this.ItemName = iName;
	}
	public void setItemQuantity(int iQuantity) {
		this.ItemQuantity = iQuantity;
	}
	public void setItemPrice(double iPrice) {
		this.ItemPrice = iPrice;
	}
	
	public boolean getStatus() {
		return this.isAvailable;
	}
	
	public int getItemNumber() {
		return this.ItemNumber;
	}
	public String getItemCode() {
		return this.ItemCode;
	}
	public String getItemName() {
		return this.ItemName;
	}
	public int getItemQuantity() {
		return this.ItemQuantity;
	}
	public double getItemPrice() {
		return this.ItemPrice;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Item Code: ");
		sb.append(this.getItemCode());
		sb.append(" || Item Name: ");
		sb.append(this.getItemName());
		sb.append(" || Item Quantity: ");
		sb.append(this.getItemQuantity());
		sb.append(" || Item Price: ");
		sb.append(this.getItemPrice());
		return sb.toString();
	}
}
