// ask for user name and age
// use Scanner to read
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Name: ");
        String n = sc.next();

        System.out.println("Your Age: ");
        int a = sc.nextInt();

        System.out.println("Hello " + n + ", you are " + a);        
    }
}