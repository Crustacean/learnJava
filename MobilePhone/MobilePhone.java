import java.util.*;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber, ArrayList<Contact> myContacts){
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<>(10);
	}
	
	public static boolean addNewContact(Contact contact) {
		if(myContacts.contains(contact)){
			return true;
		}else{
			return false;
		}
	}
	
}