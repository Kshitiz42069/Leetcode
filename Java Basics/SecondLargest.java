import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int big = arr[0];
        int sec = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(arr[i]>big){
                sec = big;
                big = arr[i];
            }
            else if(big>arr[i] && sec<arr[i]){
                sec = arr[i];
            }
        }
        if(sec == Integer.MIN_VALUE){
            System.out.println("There is no second largest number");
        }
        else{
            System.out.println("The second largest number in an array is "+sec);
        }
        sc.close();
    }
}
