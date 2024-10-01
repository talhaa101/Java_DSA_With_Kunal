import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        String personal_sms = greeting(name);
        System.out.println(personal_sms);
    }

    static String greeting(String name ) {

        String sms = "Hello " + name ;
        return sms;

       // System.out.println("hi talha");
    }

}
