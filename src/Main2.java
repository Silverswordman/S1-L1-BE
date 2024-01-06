import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String firstString = input.nextLine();
        System.out.println("La prima parola è: -" + firstString + "- ora inserisci un altra parola");
        String secondString = input.nextLine();
        System.out.println("La seconda parola è -" + secondString + "- ora inserisci un altra parola");
        String thirdString = input.nextLine();
        System.out.println("La terza parola è -" + thirdString + "- ora inserisci un altra parola");

        List<String> listaStringhe = new ArrayList<>();
        listaStringhe.add(firstString);
        listaStringhe.add(secondString);
        listaStringhe.add(thirdString);

        System.out.println("Lista in ordine di inserimento " + listaStringhe);


        Collections.reverse(listaStringhe);

        System.out.println("Lista al contrario " + listaStringhe);
        input.close();
    }
}
