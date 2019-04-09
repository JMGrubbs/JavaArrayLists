package com.John;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> mobilePhone = new ArrayList<Contacts>();

    public void addContact(String name, String num){
    Contacts conName = new Contacts( name, num);
    mobilePhone.add(conName);
    }

    public void printContacts(){
        for(int i=0; i<mobilePhone.size(); i++){
            System.out.println(mobilePhone.get(i).getName());
            System.out.println(mobilePhone.get(i).getNum());
        }
    }

    public void removeContact(String item){
        for(int i=0; i< mobilePhone.size(); i++){
            if(mobilePhone.get(i).getName().toLowerCase().equals(item.toLowerCase()) ||
                    mobilePhone.get(i).getNum().equals(item.toLowerCase())){
                System.out.println(mobilePhone.get(i).getName() + " has been removed.");
                mobilePhone.remove(i);
                break;
            }else{
                System.out.println("--------" + mobilePhone.get(i).getName());
                System.out.println("Nope");
                continue;
            }
        }
    }

    public void searchContacts(String item){
        for(int i=0; i< mobilePhone.size(); i++){
            if(mobilePhone.get(i).getName().toLowerCase().equals(item.toLowerCase()) ||
                    mobilePhone.get(i).getNum().equals(item.toLowerCase())){
                System.out.println("Contact exists." + "\n" +
                        "Name: "+ mobilePhone.get(i).getName() +  "\n"+
                        "Number: " + mobilePhone.get(i).getNum());
                break;
            }else{
                System.out.println("Contact does not exist!.... dumbie");
                continue;
            }
        }
    }

    public void modifyContact(String item, String input, int edit){
        int position = -1;

        for(int i=0; i< mobilePhone.size(); i++){
            if(mobilePhone.get(i).getName().toLowerCase().equals(item.toLowerCase()) ||
                    mobilePhone.get(i).getNum().equals(item.toLowerCase())){
                position = i;
                break;
            }else{
                continue;
            }
        }

        if(position > -1){
            if(edit == 1){
                String name = input;
                String num = mobilePhone.get(position).getNum().toLowerCase();
                Contacts newCon = new Contacts(name, num );
                mobilePhone.set(position, newCon );
            }else if(edit == 2){
                String name = mobilePhone.get(position).getName().toLowerCase();
                String num = input;
            Contacts newCon = new Contacts(name, num );
            mobilePhone.set(position, newCon );
            }
        }
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
