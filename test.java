//Name: Davis Tyler
//Class: CS145
//Date: 1/19/24
//Program: Letter Inventory
//File: Test
//references: CS145 Lectures
//purpose: This program creates a inventories of letters 

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
