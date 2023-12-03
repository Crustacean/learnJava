import java.util.*;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber){
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName()) >= 0) {
			System.out.println("Contact already saved.");
			return false;
		}
		
		myContacts.add(contact);
		return true;
		
	}
	
	public boolean updateContact(Contact oldContact, Contact updateContact) {
		int findPosition = findContact(oldContact);
		
		if(findPosition < 0) {
			System.out.println(oldContact.getName() + ", was not found.");
			return false;
		}else if (findContact(updateContact.getName()) != -1) {
			System.out.println(updateContact.getName() + " already exists. Cannot update.");
			return false;
		}
		
		this.myContacts.set(findPosition,updateContact);
		System.out.println("Update successful. "+oldContact.getName()+" replaced with "+updateContact.getName());
		return true;
		
	}
	
	public boolean removeContact(Contact deleteContact) {
		if(findContact(deleteContact) > -1){
			this.myContacts.remove(deleteContact);
			return true;
		}else {
			return false;
		}
	}
	
	private int findContact(Contact findContact) {
		return myContacts.indexOf(findContact);
	}
	
	private int findContact(String findContact) {
		for(int i=0; i<myContacts.size(); i++) {
			if(myContacts.get(i).getName().equals(findContact)) {
				return i;
			}
		}
		return -1;
	}
	
	public Contact queryContact(String searchContact) {
		int position = findContact(searchContact);
		if(position >= 0) {
			return this.myContacts.get(position);
		}else {
			return null;
		}
	}
	
	public void printContacts() {
		System.out.println("Contact List:");
		for(int i=0; i<myContacts.size(); i++) {
			System.out.println((i + 1) + ". " +this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
		}
	}
	
}