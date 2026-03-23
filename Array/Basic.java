//Time complexity : O(n), Space complexity : O(n)

import java.util.Scanner;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++){
            String msg = "Enter the element %d";
            String outMsg = String.format(msg,i);
            System.out.println(outMsg);
            arr[i-1] = sc.nextInt();
        }
        System.out.println("Printing in order and reverse order");
        //Reverse order and order
        int sum = 0;
        int min = arr[0], max = arr[0];
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
            sum+=arr[i];
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println();
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
        //crossover
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        //     System.out.println(arr[n-1-i] + " ");
        // }
        System.out.println("Sum of the array is "+sum);
        System.out.println("Maximum element in the array is " +max);
        System.out.println("Minimum element in the array is " +min);

    }
}