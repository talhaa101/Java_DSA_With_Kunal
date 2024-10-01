public class pass_value_sum {
    public static void main(String[] args) {

        int result = sum(20, 30);
        System.out.println("The result is = " + result);
        
    }
    // pass the value of numbers when you are 
    //calling the method in main()
    static int sum (int a , int b) {
        int sum = a + b ;
        return sum ;
    }
}
