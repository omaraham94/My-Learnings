package ContactsPhoneProgram;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public void store(Contacts newContact) {
        contacts.add(newContact);
    }

    public void modifyContact(String oldName, String newName, String newNumber) {
        Contacts contact = findContact(oldName);
        if (contact != null) {
            contact.setName(newName);
            contact.setPhoneNumber(newNumber);
        }
    }

    public void removeContact(String contactName) {
        int position = contacts.indexOf(findContact(contactName));
        if (position != -1) {
            removeContact(position);
        } else {
            System.out.println("contact not found cannot remove");
        }
    }

    private void removeContact(int position) {
        contacts.remove(position);
    }

    public Contacts findContact(String contactName) {
        for (Contacts contact : contacts) {
            if(contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public void printAllContacts() {
        for (Contacts contact : contacts) {
            System.out.println("Name : " + contact.getName() + " Phone Number: " + contact.getPhoneNumber());
        }
    }

    public boolean checkExistance(String contactName) {
        if (findContact(contactName) != null) {
            System.out.println("The contact exists");
            return true;
        } else {
            System.out.println("the contact doesnot exist");
            return false;
        }
    }

}
