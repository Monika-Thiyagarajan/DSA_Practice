//TC - > O(n^4) SC -> O(1)
import java.util.Scanner;
public class InvertedRightPyramid{
    static void patternStar(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternNumber(int n){
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pyramid:");
        int n = sc.nextInt();
        System.out.println("Star");
        sc.close();
        patternStar(n);
        System.out.println("Number: ");
        patternNumber(n);
    }
}