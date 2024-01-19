
import java.util.Arrays;

public class LetterInventory {

    public int [] inventory = new int[27];

    public LetterInventory (String data) { 

        char[] dataChar = new char[data.length()];
        
        for (int i = 0; i <data.length(); i++) {

            data.toLowerCase();

            char currentLetter = data.charAt(i);

            dataChar[i] = currentLetter;

        } 

        for ( int i =0; i < dataChar.length; i++) {

            //int currentCharInt = currentChar;
            int currentCharInt = dataChar[i]-97;

            //System.out.println(dataChar[i]);

            if( dataChar[i] < 96 || dataChar[i] > 122) {

            inventory[26]++;

            } else {

                inventory[currentCharInt]++;

            }

        }

        //System.out.println(data);

    }

    public String toString() {

        String InventoryToString = " ";

        for(int i = 0; i < inventory.length; i++) {

            if (inventory[i]== 0) {

            } else {

                InventoryToString = InventoryToString + "[";

                int currentLetterASCII = i + 97;

                char currentLetter = (char)currentLetterASCII;


                for(int j=0; j < inventory[i]; j++) { 

                    String currentCharString = Character.toString(currentLetter);

                    InventoryToString = InventoryToString + currentCharString;

                }

                InventoryToString = InventoryToString + "]";

            }
            
            
        }

        return InventoryToString;

    }

    public int get (char letter) {

        int CurrentLetterInt = letter-97;

        int CurrentLetterCount = inventory[CurrentLetterInt];

        return CurrentLetterCount;


    }

    public void set (char letter, int value) {

        int CurrentLetterInt = letter-97;

        inventory[CurrentLetterInt] = value;
    }

    public int size () {

        int size = 0;

        return size;


    }



}


