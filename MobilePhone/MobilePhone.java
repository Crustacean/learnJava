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
	
	public static boolean updateContact(Contact existingContact, Contact updateContact) {
		if(myContacts.contains(existingContact)){
			existingContact = updateContact;
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean removeContact(Contact deleteContact) {
		if(myContacts.contains(deleteContact)){
			myContacts.remove(deleteContact);
			return true;
		}else {
			return false;
		}
	}
	
	public static int findContact(Contact findContact) {
		return myContacts.indexOf(findContact);
	}
	
	public static int findContact(String findContact) {
		return myContacts.indexOf(findContact);
	}
	
	public static Contact queryContact(String searchContact) {
		if(myContacts.contains(searchContact)) {
			return Contact;
		}else {
			return null;
		}
	}
	
	public static void printContacts() {
		System.out.println("Contact List:");
		for(int i=1; i<=myContacts.size(); i++) {
			System.out.printf("%d. %d -> %d", i, myContacts.get(i), myContacts.get(i));
		}
	}
	
}