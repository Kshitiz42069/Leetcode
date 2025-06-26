import java.util.Scanner;

public class Second {
    public static int addm(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = sc.nextInt();
        int []arr = new int[a];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < a; i++) {
            arr[i]=sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            if(res<arr[i]){
                res = arr[i];
            }
        }
        System.out.println("Biggest number is "+res);
        sc.close();
    }
}
