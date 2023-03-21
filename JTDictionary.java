// Joanne To
// 03/14/2023
// CS&145
// Lab #6: Binary Search Tree Dictionary
//
// This program will create a dictionary with records including data and allows the user to 
// add, delete, look up, modify, and ask for the number of. 
//
// For extra credit I used switch case.

import java.util.*;
import java.io.*;

public class JTDictionary {
   public static void main (String[] args) {
      DictionaryTree Dictionary = new DictionaryTree();
  
      char choice = 'z';
      while (choice != 'q' && choice != 'Q') {
         choice = printMenu();
         prompt(choice);
      }

   }//end of main


   public static char printMenu() {
      Scanner input = new Scanner(System.in);
   
      System.out.println("\nPlease select an option:");
      System.out.println("[A] Add");
      System.out.println("[D] Delete");
      System.out.println("[M] Modify");
      System.out.println("[L] Lookup");
      System.out.println("[R] List number of records");
      System.out.println("[Q] Quit");
      System.out.print("Your selection: ");
      //add error catch
      //if invalid, printMenu();
      String pick = input.nextLine();
      char choice = pick.charAt(0);
      
      return choice;

   }//end of printMenu


   public static void prompt(char choice) {
      Scanner input = new Scanner(System.in);
      int key = 0;
   
      switch (choice) {
            case 'a': case 'A': 
               //adds
               System.out.println("Please enter unique keyfor entry: ");
               key = input.nextInt();
               //DictionaryNode contactNode = new DictionaryNode(key);
               Dictionary.insert(key);
               
               break;
            case 'd': case 'D': 
               //deletes
               System.out.println("Please enter the entry's unique key: ");
               key = input.nextInt();
               Dictionary.delete(key);
               break;
            case 'm': case 'M': 
               //modifies
               System.out.println("Please enter the entry's unique key: ");
              key = input.nextInt();
               break;
            case 'l': case 'L':
               //looks up
               System.out.println("Please enter the entry's unique key: ");
              key = input.nextInt();
              break;
            case 'r': case 'R':
               //# of lists
              
               break;
            case 'q': case 'Q': 
               //quits program
               System.out.println("Thank you for using the program.");
               break;
            default: 
               //invalid input
               System.out.println("Invaild input. Please try again.");
               break;
      }//end of switch case
   }//end of prompt





}//end of JTDictionary


//+1hour
//+1hour
//+2hour