import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = sc.nextInt();
        int []arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of all the elements is");
        int res = 0;
        for (int i = 0; i < a; i++) {
            res= res+arr[i];
        }
        System.out.println("it is what it is "+res);
    }
}
