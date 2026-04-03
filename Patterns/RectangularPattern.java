//Time Complexity - n^2 Space Complexity -> O(1)
import java.util.Scanner;
class RectangularPattern{
    static void pattern(int n){ 
        //Used static method as it doesn't depend on object data
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the size of star");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        pattern(n);
        inp.close();
    }
}