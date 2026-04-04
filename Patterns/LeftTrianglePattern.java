//TC -> O(n^2) SC -> O(1) only input variables

import java.util.Scanner;
class Pattern{
    void pattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class LeftTrianglePattern{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int n = inp.nextInt();
        inp.close();
        Pattern ob = new Pattern();
        ob.pattern(n);
        // Pattern.pattern(n);
    }
}