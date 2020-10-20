package finalProjecct;


public class Constants {
	
	public static final String MAINHEADER = "LOG-IN TO YOUR ACCOUNT";
	public static final String DEFAULTUSERNAME = "admin";
	public static final String DEFAULTPASSWORD = "admin";

	public static final String ENTERUSERNAME = "USERNAME: ";
	public static final String ENTERPASSWORD = "PASSWORD: ";
	
	public static final String AVAILABLEITEMS = "Available Items";
	public static final String UPDATEDITEMS = "Update Successful";
	public static final String INVALIDUSERNAME = "\nUsername does not exist.";
	public static final String INVALIDPASSWORD = "\nInvalid Password.";
	
	public static final String ENTERITEMCODE = "Item Code: ";
	public static final String ENTERITEMNAME = "Item Name: ";
	public static final String ENTERITEMQUANTITY = "Item Quantity: ";
	public static final String ENTERITEMPRICE = "Item Price: ";
	public static final String ITEMSUCCESSMESSAGE = "\nItem Successfully added!";
	public static final String ITEMBOUGHT = "\nItem Succesfully bought";
	public static final String USERNAMEEXISTS = "Username Already Exists.";
	public static final String ENTERITEMTOBEDELETED = "Enter item number to be deleted: ";
	
	public static final String ITEMSFOUND = "\nItem(s) found";
	
	public static final String ITEMEXSITS = "\nItem Already Exists.";
	public static final String LINE = "--------------------------------------------------------------------------";
	
	public static final String ADMINHEADER = "\nWelcome! ";
	public static final String CASHIERHEADER = "\nWelcome! ";
	
	public static final String ADMINMENU = "\nADMIN MENU\n\n[1] Add Item\n[2] Delete Item\n[3] Generate Reports\n[4] Add User\n[5] Log out \n\nSelection: ";
	public static final String ADMINADDUSER = "ADD ANOTHER USER";
	public static final String ADDADMIN = "ENTER DATA FOR NEW ADMIN\n";
	public static final String USERUCCESSMESSAGE = "\nUSER SUCCESSFULLY ADDED";
	public static final String ADDCASHIER = "ENTER DATA FOR NEW CASHIER\n";
	
	public static final String LOGOUTSUCCESS = "Logged out successfully";
	public static final String CASHIERMENU = "\nCASHIER MENU \n\n[1] Search Item \n[2] Sell Item \n[3] Log out \n\nSelection: ";
	public static final String INVALIDINPUT = "Invalid Input";
	
	public static final String SELECTUSERTPYE ="\nPlease select user type \n[1] Admin \n[2] Cashier \n\nSelection: ";
	
	public static final String SELECTSEARCHTYPE = "\n[1] ITEM CODE \n[2] ITEM NAME \n[3] ITEM PRICE \n\nSelection: ";

	public static String CHOICE = "";
	public void setChoice(String ch) {
		this.CHOICE = ch;
	}
	public String getChoice() {
		return this.CHOICE;
	}
}
