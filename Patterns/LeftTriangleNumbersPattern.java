//TC -> O(n^2), SC -> O(1)
import java.util.Scanner;
public class LeftTriangleNumbersPattern{
    void pattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of triangle: ");
        int n = sc.nextInt();
        sc.close();
        LeftTriangleNumbersPattern obj = new LeftTriangleNumbersPattern();
        obj.pattern(n);
    }
}