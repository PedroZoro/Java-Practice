import java.util.Scanner;

public class conditional_statement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("ADULT! ACCESS GRANTED");
        }

        else{
            System.out.println("MINOR ALERT !!!! GO AWAY");
        }
    }
}
