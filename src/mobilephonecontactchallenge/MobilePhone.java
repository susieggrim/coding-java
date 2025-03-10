package mobilephonecontactchallenge;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        int index = findContact(contact);
        if (index > -1) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact contact) {
        int index = findContact(oldContact);
        if (index > -1) {
            myContacts.add(index, contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index > -1) {
            myContacts.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        if (!myContacts.isEmpty()) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index > -1) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

}