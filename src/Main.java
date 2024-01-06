import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("inserisci un numero intero");
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("inserisci un altro numero intero");
        int y = Integer.parseInt(scanner.nextLine());


        System.out.println("result" + " " + x * y);

        System.out.println("Quanti Anni Hai?");


        String firstWord = " Anni";
        int z = Integer.parseInt(scanner.nextLine());


        System.out.println("Ho " + z + firstWord);


        String arrayWord = "Hola";
        String[] firstArray = {"Hello", "Ciao", "Nǐhǎo", "Salut", "Tschüss"};


        String[] secondArray = {firstArray[0], firstArray[1], arrayWord, firstArray[2], firstArray[3], firstArray[4]};


        System.out.println(Arrays.toString(secondArray));
        scanner.close();
    }
}