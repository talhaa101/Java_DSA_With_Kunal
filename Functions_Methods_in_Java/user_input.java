import java.util.Scanner ;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Please Enter 1st number : "); 
        int num1 = sc.nextInt();
        System.out.print("Please Enter 2nd number : "); 
        int num2 = sc.nextInt();

        int sum = num1 + num2 ;

        int mul = num1 * num2 ;

        System.out.println("sum is = " + sum);

        System.out.println("multiplication is = " + mul);



        
    }
    
}
