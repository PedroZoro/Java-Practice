import java.util.Scanner;

public class fun_sum_of_two {
    public static void Sum(int num){
        System.out.println(num); // arg of the function
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Sum(num1+num2); //the operation to be perfomed to give the arg of function value
    }
}
