import java.util.*;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber, ArrayList<Contact> myContacts){
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<>(Contact);
	}
	
	public static boolean addNewContact(Contact contact) {
		if(findContact(contact.getName() < 0) ){
			return true;
		}else{
			System.out.println("Contact already saved.");
			return false;
		}
	}
	
	public static boolean updateContact(Contact oldContact, Contact updateContact) {
		if(findContact(oldContact) < 0) {
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
	
	private static int findContact(Contact findContact) {
		return myContacts.indexOf(findContact);
	}
	
	private static int findContact(String findContact) {
		for(int i=0; i<myContacts.size(); i++) {
			if(myContacts.get(i).getName().equals(findContact)) {
				return i;
			}
		}
		return -1;
	}
	
	public static Contact queryContact(String searchContact) {
		int position = findContact(searchContact);
		if(position >= 0) {
			return this.myContacts.get(position);
		}else {
			return null;
		}
	}
	
	public static void printContacts() {
		System.out.println("Contact List:");
		for(int i=1; i<=myContacts.size(); i++) {
			System.out.printf("%d. %d -> %d", i, this.myContacts.get(i).getName(), this.myContacts.get(i).getPhoneNumber());
		}
	}
	
}