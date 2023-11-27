import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       int x= 4 ,y=2;

            System.out.println(x*y);

            String firstWord = " Anni";
            int z= 30;
        System.out.println("Ho "+ z + firstWord);




        String arrayWord = "Hola";
        String[] firstArray  = { "Hello","Ciao", "Nǐhǎo","Salut","Tschüss"};


        String [] secondArray= { firstArray[0],firstArray[1],arrayWord,firstArray[2],firstArray[3],firstArray[4]};


        System.out.println(Arrays.toString(secondArray));
    }
}