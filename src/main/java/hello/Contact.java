package hello;

import java.util.ArrayList;

public class Contact {
    private String contactId;
    private String domain;
    private String firstName;
    private String lastName;
    private ArrayList<String> email = new ArrayList<String>();
    private ArrayList<Integer> phoneNumber = new ArrayList<Integer>();
    

    public Contact(String contactId, String domain, String firstName, String lastName, 
    		ArrayList<String> email, ArrayList<Integer> phoneNumber ) {
        this.setContactId(contactId);
        this.setDomain(domain);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }
    
    public Contact(String contactID, String domain) {
    	this.setContactId(contactID);
    	this.setDomain(domain);
    	this.firstName = "";
    	this.lastName = "";
    	this.email = null;
    	this.phoneNumber = null;
    }

	public ArrayList<String> getEmail() {
		return email;
	}

	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}

	public ArrayList<Integer> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(ArrayList<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getContactId() {
		return contactId;
	}


	public void setContactId(String contactId) {
		this.contactId = contactId;
	}


	public String getDomain() {
		return domain;
	}


	public void setDomain(String domain) {
		this.domain = domain;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
