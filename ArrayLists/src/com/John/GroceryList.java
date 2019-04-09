package com.John;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryLint(){
        System.out.println("you have "+ groceryList.size() + " items in " +
                "your grocery list");
        for(int i = 0; i< groceryList.size(); i++){
            System.out.println((i + 1) + ". "+ groceryList.get(i));
        }
    }

    public void modifyArrayList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Item "+ (position + 1)+ " has been modified.");

    }

    public void removeItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >=0){
            return  groceryList.get(position);
        }else {
            return "Item does not exist";
        }
    }
}
