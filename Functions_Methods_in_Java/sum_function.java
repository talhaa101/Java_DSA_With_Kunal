import java.util.Scanner;

public class sum_function {
    public static void main(String[] args) {
        int result = sum2();
        System.out.println("result is = " + result);
    }

    static int sum2() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.print("enter number 2 : ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        //System.out.println("sum is = " + sum);
        return sum ; // function over

        //System.out.println("this line will never execute");

    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.print("enter number 2 : ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("sum is = " + sum);
    }

    /*
     * 
     * 
     * return_type name () {
     * body
     * return statement ;
     * }
     * 
     * 
     * 
     * 
     */
}
