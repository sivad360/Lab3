
import java.util.Arrays;

public class LetterInventory {

    private int [] inventory = new int[27]; // array contains main data for each instance modified 
    //by other methods

    public LetterInventory (String data) {  // adds inventory values for input string used when 
        //creating instance

        char[] dataChar = new char[data.length()]; // char array representation of input string
        for (int i = 0; i <data.length(); i++) {
            data.toLowerCase();
            char currentLetter = data.charAt(i);
            dataChar[i] = currentLetter;
        } 


        for ( int i =0; i < dataChar.length; i++) { // cast each char to int and iterate corresponding
            //index unless non alphabet then iterate last position of inventory
            int currentCharInt = dataChar[i]-97;
            if( dataChar[i] < 96 || dataChar[i] > 122) {
            inventory[26]++;
            } else {
                inventory[currentCharInt]++;
            }
        }

    }

    public String toString() {

        String InventoryToString = ""; 

        for(int i = 0; i < inventory.length; i++) { //for each index of inventory if index has a non 
            //zero value then print out bracket and a number of char corresponding to inventory value

            if (inventory[i]== 0) {
            } else {
                InventoryToString = InventoryToString + "[";
                int currentLetterASCII = i + 97; // convert between types so can be output as string
                char currentLetter = (char)currentLetterASCII;
                for(int j=0; j < inventory[i]; j++) { 
                    String currentCharString = Character.toString(currentLetter);
                    InventoryToString = InventoryToString + currentCharString;
                }
                InventoryToString = InventoryToString + "]";
            } 
        }

        return InventoryToString; // return final full concatencated string

    }

    public int get (char letter) { // returns quantity of given letter in inventory

        int CurrentLetterInt = letter-97;
        int CurrentLetterCount = inventory[CurrentLetterInt];

        return CurrentLetterCount;

    }

    public void set (char letter, int value) { // sets quantity of given letter in inventory

        int CurrentLetterInt = letter-97;
        inventory[CurrentLetterInt] = value;

    }

    public int size () { // not finished unsure how to make "fast"

        int size = 0;

        return size;

    }

    public LetterInventory add (LetterInventory other) { // adds given instance of inventory to local 
        //instance of inventory 

        LetterInventory addedLetterInventories = new LetterInventory(""); //initialize necessary objects
        int[] otherIntArray = new int[27];

        for (int i = 0; i < 27; i ++) { // for each index of inventory array take values from given and 
            //local inventory add them together and set them into new instance of inventory
            int currentLetterInt = i + 97;
            char currentLetter = (char)currentLetterInt;        
            otherIntArray[i] = other.get(currentLetter);
            addedLetterInventories.set(currentLetter, inventory[i]+otherIntArray[i]);
        }

        return addedLetterInventories;
        
    }

    public LetterInventory subtract (LetterInventory other)  { // subtracts given instance of inventory 
        //from local instance of inventory similar to add method except with logic to return null
        //if subtracted vale is negative

        LetterInventory subtractedLetterInventories = new LetterInventory("");
        int[] otherIntArray = new int[27];

        for (int i = 0; i < 27; i ++) {
            int currentLetterInt = i + 97;
            char currentLetter = (char)currentLetterInt;
            otherIntArray[i] = other.get(currentLetter);
            int currentLetterSubtractedInventory = inventory[i] - otherIntArray[i];

            if ( currentLetterSubtractedInventory < 0 ) { // logic for returning null 

                return null;

            } else if (currentLetterSubtractedInventory >= 0) {

             subtractedLetterInventories.set(currentLetter, currentLetterSubtractedInventory);

            }
        }

        return subtractedLetterInventories;

    }

}


