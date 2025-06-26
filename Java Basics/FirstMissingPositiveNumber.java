import java.util.Scanner;

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            while (
                arr[i] > 0 &&
                arr[i] <= n &&
                arr[arr[i]-1] != arr[i]
            ) {
                int correctIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= i+1){
                res = i+1;
            }
        }
        System.out.println("Result of missing the positive Number is "+res);
    }    
}
