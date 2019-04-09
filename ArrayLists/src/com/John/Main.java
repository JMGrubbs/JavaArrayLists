package com.John;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextInt();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryLint();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("Press ");
        System.out.println("1 - 6");
    }


    public static void addItem(){
        System.out.print("Please enter item to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int item =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newitem = scanner.nextLine();
        groceryList.modifyArrayList(item - 1, newitem);
    }

    public static void removeItem(){
        System.out.println("Enter item number: ");
        int item =scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(item - 1);
    }

    public static void searchForItem(){
        System.out.println("Enter item name: ");
        String item = scanner.nextLine();
        if(groceryList.findItem(item) !=null){
            System.out.println("Found searched item in" +
                    " grocery list.");
        }else {
            System.out.println("Did not find item.");
        }
    }
}
