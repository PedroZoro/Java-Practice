import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("HELLO");
                break;

            case 2:
                System.out.println("NAMASTE");
                break; // break is important for only this line to print on particular value and not the next follows

            case 3:
                System.out.println("VADAKAMMMM ");
        
            default: // default is for no case satisfied statement 
                System.out.println("Invalid input !!!!");
                break;
        }

    }
}
