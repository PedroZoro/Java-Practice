import java.util.Scanner;

public class func_product_of_two {
    public static int product(int a , int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.err.println("product = "+ product(a, b));
    }
}
