package com.John;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        mobilePhone.addContact("John", "555-555-5555");
        mobilePhone.addContact("Joe", "777-777-7777");
        runPhone();
    }

    public static void runPhone(){
        boolean on = true;
        int condition = 0;
        printInstructions();

        while(on){
            System.out.println("Enter your choice: ");
            condition = scanner.nextInt();
            scanner.nextLine();

            switch(condition){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    editContact();
                    break;
                default:
                    on = false;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("1: print contacts");
        System.out.println("2: add Contact");
        System.out.println("3: remove Contact");
        System.out.println("4: search contact");
        System.out.println("5: edit contact");
        System.out.println("6: turn off");
    }

    public static void addContact(){
        System.out.print("Enter Name: ");
        String contactName = scanner.next();
        scanner.nextLine();

        System.out.print("Enter Number: ");
        String contactNum = scanner.next();
        scanner.nextLine();
        mobilePhone.addContact(contactName, contactNum);
        System.out.println( "New contact " + contactName + " with number " + contactNum + "\n" +
                " added to Contacts");
    }

    public static void removeContact(){
        System.out.println("Enter Item Name to remove it: ");
        String item = scanner.next();
        scanner.nextLine();

        mobilePhone.removeContact(item);
    }

    public static void searchContact(){
        System.out.println("Enter item to search for: ");
        String item = scanner.next();
        scanner.nextLine();

        mobilePhone.searchContacts(item);
    }

    public static void editContact(){
        System.out.println("Enter 1 or 2 for Name or Num");
        int edit = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter item Name or number you wish to change");
        String item = scanner.next();
        scanner.nextLine();

        System.out.println("Enter new Input");
        String input = scanner.next();
        scanner.nextLine();

        mobilePhone.modifyContact(item, input, edit);

        System.out.println("Name changed to: " + input);
    }
}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.