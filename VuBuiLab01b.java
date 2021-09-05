import java.util.Scanner;  //Import the Scanner class

public class VuBuiLab01b {
    public static void main (String []args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a number in pounds");
        int a = k.nextInt() ;
        double b = 0.454;
        double result;


        //convert the lbs to kg
        result = a * b;
        // to print out the kg result after conversion
        System.out.println("result " + result);
    }
}
