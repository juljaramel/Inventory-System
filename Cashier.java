package finalProjecct;

import java.util.Scanner;
public class Cashier {
	Scanner sc = new Scanner(System.in);
	public void cashierMenu() {//fix cashier header
	Constants c = new Constants();
	
	do {
	System.out.println(Constants.LINE);
	System.out.print(Constants.CASHIERMENU);
	c.setChoice(sc.next());
	switch(c.getChoice()) {
		case "1": {//Search item
			System.out.print(Constants.SELECTSEARCHTYPE);
			c.setChoice(sc.next());
			switch(c.getChoice()) {
				case "1":{
					searchItemCode();
					break;
				}
				case "2":{
					searchItemName();
					break;
				}
				case "3":{
					searchItemPrice();
					break;
				}
				default:
					System.out.println(Constants.INVALIDINPUT);
			}
			break;
		}
		case "2":{//Sell item
			System.out.println(Constants.LINE);
			System.out.println(Constants.AVAILABLEITEMS);
			for(Item all: Item.ItemList) {
				System.out.println(all.toString());
			}
			System.out.println(Constants.LINE);
			Item i = new Item();
			System.out.print(Constants.ENTERITEMNAME);
			i.setItemName(sc.next());
			System.out.print(Constants.ENTERITEMQUANTITY);
			i.setItemQuantity(sc.nextInt());
			for(Item all: Item.ItemList) {
				if(i.getItemName().equals(all.getItemName())) {
					all.setItemQuantity(all.getItemQuantity()-i.getItemQuantity());
					System.out.println(Constants.ITEMBOUGHT);
					System.out.println(Constants.LINE);
					System.out.println(all.toString());
				}	
			}break;
		}
		case "3":{
			System.out.println(Constants.LINE);
			System.out.println(Constants.LOGOUTSUCCESS);
			System.out.println(Constants.LINE);
			Rename z = new Rename();
			User newLogin = new User();
			z.userLogin(newLogin);
		}
		default:
			System.out.println(Constants.INVALIDINPUT);
			}
		}while(c.getChoice()!="3");	
	}
	private void searchItemCode() {
		Item i = new Item();
		System.out.println(Constants.LINE);
		System.out.print(Constants.ENTERITEMCODE);
		i.setItemCode(sc.next());
		//Fix Message
		System.out.println(Constants.ITEMSFOUND);
		for(Item CODE: Item.ItemList) {
			if(i.getItemCode().equals(CODE.getItemCode())) {
				System.out.println(CODE.toString());
			}
		}
	}
	private void searchItemName() {
		Item i = new Item();
		System.out.println(Constants.LINE);
		System.out.print(Constants.ENTERITEMCODE);
		i.setItemName(sc.next());
		System.out.println(Constants.ITEMSFOUND);
		for(Item NAME: Item.ItemList) {
			if(i.getItemCode().equals(NAME.getItemName())) {
				System.out.println(NAME.toString());
			}
		}
	}
	private void searchItemPrice() {
		Item i = new Item();
		System.out.println(Constants.LINE);
		System.out.print(Constants.ENTERITEMCODE);
		i.setItemPrice(sc.nextDouble());
		System.out.println(Constants.ITEMSFOUND);
		for(Item PRICE: Item.ItemList) {
			if(i.getItemPrice()==(PRICE.getItemPrice())) {
				System.out.println(PRICE.toString());
			}
		}
	}
}
