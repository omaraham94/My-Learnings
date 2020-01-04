package ContactsPhoneProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MobilePhone phone = new MobilePhone();
        printOptionList();
        boolean quit = false;
        while(!quit) {
            System.out.println("enter the option:");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    phone.printAllContacts();
                    break;
                case 2:
                    System.out.println("Enter contact name :");
                    String contactName = scan.nextLine();
                    System.out.println("Enter phone number");
                    String phoneNumber = scan.nextLine();
                    phone.store(new Contacts(contactName, phoneNumber));
                    break;
                case 3:
                    System.out.println("Enter the contact name you want to update");
                    String oldContactName = scan.nextLine();
                    System.out.println("Enter the new contact name");
                    String newContactName = scan.nextLine();
                    System.out.println("Enter the new contact number");
                    String newContactNumber = scan.nextLine();
                    phone.modifyContact(oldContactName, newContactName, newContactNumber);
                    break;
                case 4:
                    System.out.println("enter the name u want to remove");
                    String removeName = scan.nextLine();
                    phone.removeContact(removeName);
                    break;
                case 5:
                    System.out.println("Enter the name whos contact u want to check the existance of");
                    String checkName = scan.nextLine();
                    phone.checkExistance(checkName);
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    public static void printOptionList() {
        System.out.println("Enter 1 for printing list of cantacts");
        System.out.println("Enter 2 for adding new contact");
        System.out.println("Enter 3 for updating existing contact");
        System.out.println("Enter 4 for removing contact");
        System.out.println("Enter 5 for checking if a contact exists");
        System.out.println("Enter any other number to exit");
    }
}
