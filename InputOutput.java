import java.util.Scanner;
public class InputOutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the whole number:");
        int intnum = sc.nextInt();
        System.out.println("User entered the number:"+intnum);

         System.out.println("Enter the floating number:");
        float floatnum = sc.nextFloat();
        System.out.println("User entered the number:"+floatnum);

         System.out.println("Enter the double number:");
        double doublenum = sc.nextDouble();
        System.out.println("User entered the number:"+doublenum);

        System.out.println("Enter the character:");
        char charinp = sc.next().charAt(0);
        System.out.println("User entered the character:"+charinp);

         System.out.println("Enter the word:");
        String wordinp = sc.next();
        System.out.println("User entered the word:"+wordinp);
        
        System.out.println("Enter the sentence:");
        sc.nextLine();
        String input = sc.nextLine();
        System.out.println("User entered the sentence:"+input);


        sc.close();
    }
}