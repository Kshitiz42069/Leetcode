import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //to move zeroes to end
        // int index = 0;
        // for (int i = 0; i < n; i++) {
        //     if(arr[i]!=0){
        //         arr[index] = arr[i];
        //         index++;
        //     }
        // }
        // while(index<n){
        //     arr[index] = 0;
        //     index++;
        // }

        //to move zeroes at start
        int index = n-1;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]!=0){
                arr[index] = arr[i];
                index--;
            }
        }

        while(index>=0){
            arr[index] = 0;
            index--;
        }
        System.out.println("After moving the zeroes");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }    
}
