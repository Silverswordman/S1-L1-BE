import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
System.out.println("Type the first string");
String firstString=input.nextLine();
System.out.println( "First String " +  firstString);
String secondString=input.nextLine();
System.out.println( "Second String " +  secondString);
String thirdString=input.nextLine();
System.out.println( "Third String " +  thirdString);

String firstPhrase = " " + firstString + " " + secondString+ " " +  thirdString;
System.out.println ( "Ordered strings" +  firstPhrase);

String secondPhrase = " "+thirdString + " " + firstString+ " " +  secondString;
System.out.println ( "Unordered strings" + secondPhrase);
 input.close();
    }
}
