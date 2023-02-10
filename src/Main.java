import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Skriv in ditt namn");
        //använder nextLine eftersom next används för ett enda ord
        String nameInput =scanner.nextLine();
        //räknar ut längden av namnet
        int nameLength=nameInput.length();
        //sedan skriver den ut
        System.out.println("Ditt namn är " + nameInput + " och det är " + nameLength + " bokstäver lång");
    }
}