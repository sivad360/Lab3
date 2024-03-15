//Name: Davis Tyler
//Class: CS145
//Date: 2/7/2024
//Program: Phone Book
//File: Test
//references: Lectures, https://www.devglan.com/datastructure/linkedlist-implementation-java
//purpose: This program creates a linked list which is made up of people The program gives
// the option to print out, search for, delete, or modify individuals
//import LetterInventory;

public class test {



    public static void main(String[] args) {
        LetterInventory LetterInventory1 = new LetterInventory("aaaaabbbb");

        LetterInventory LetterInventory2 = new LetterInventory("aabb");

        LetterInventory AddedInventories = LetterInventory1.add(LetterInventory2);

        LetterInventory SubtractedInventories = LetterInventory1.subtract(LetterInventory2);

       
        System.out.println("String representation of added inventory");
        System.out.println(AddedInventories.toString());

        System.out.println("String representation of subtracted inventory");
        System.out.println(SubtractedInventories.toString());

        System.out.println("Number of a's");

        AddedInventories.set('a',7);

        System.out.println(AddedInventories.get('d'));

        System.out.println(AddedInventories.size());

        

        //System.out.println(LetterInventory2.get('b'));

        

    }

}
