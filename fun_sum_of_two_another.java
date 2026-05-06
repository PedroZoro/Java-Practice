import java.util.Scanner;

public class fun_sum_of_two_another {
    public static int Calculate(int num1, int num2){
        int num = num1 + num2;
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num = Calculate(num1, num2);
        System.out.println(num);
    }
}

//In Java, void is a reserved keyword used to indicate that a method does not return any value after it is executed. While the method performs an action, such as printing text or modifying data, it does not send a result back to the code that called it
//No Return Value: A void method cannot be used in an assignment (e.g., int x = myVoidMethod(); will cause a compilation error).
//Mandatory Placeholder: Java requires every method to have a specified return type. If there is no data to return, you must explicitly use void.
//Return Statement: While not required, you can use the return; statement (without a value) to exit a void method early.
//The main Method: The entry point of every Java application, public static void main(String[] args), is declared as void because the Java Virtual Machine (JVM) does not expect a return value from the program's starting point.
