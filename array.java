import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        //for input
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        //for output
        for(int i=0; i<size; i++){
            System.out.println(nums[i]);
        }
    }
}
