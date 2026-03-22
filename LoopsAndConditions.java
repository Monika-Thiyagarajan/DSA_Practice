import java.util.Scanner;
/*
Write a program that:

Takes an integer n from the user.
Prints all numbers from 1 to n.
For multiples of 3 → print "Fizz"
For multiples of 5 → print "Buzz"
For multiples of both 3 and 5 → print "FizzBuzz"
For others → print the number itself

This combines loops + if-else + modulus operator
*/
public class LoopsAndConditions{
    public static void main(String[] args){

        System.out.println("Enter the integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n+1;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i+ " ");
        }
        /*
        System.out.println("Printing all numbers from 1 to n");
        for(int i=1; i<n+1; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        int i = 1;
        while(i<n+1){
             System.out.println("");
            if(i%3==0)
                System.out.print("Fizz");
            else if(i%5==0)
                System.out.print("Buzz");
            else if(i%3==0 && i%5==0)
                System.out.print("FizzBuzz");
            else
                System.out.print(i);
            i++;
        }
        System.out.println("");
        switch(n){
            case 5:
                System.out.print("Multiple of 5");
                break;
            case 3:
                System.out.print("Multiple of 3");
                break;
            case 15:
                System.out.print("Multiple of both");
                break;
            default:
                System.out.print("Can't predict the multiples for" +n);
        }
        */
    }
}