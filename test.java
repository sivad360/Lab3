
//import LetterInventory;

public class test {



    public static void main(String[] args) {
        LetterInventory LetterInventory1 = new LetterInventory("aaaaabbbb");

        LetterInventory LetterInventory2 = new LetterInventory("bbbbbbb");

       
        System.out.println("String representation of inventory");
        System.out.println(LetterInventory1.toString());

        System.out.println("Number of _'s");

        LetterInventory1.set('a',7);

        System.out.println(LetterInventory1.get('a'));

        

        //System.out.println(LetterInventory2.get('b'));

        

    }

}
