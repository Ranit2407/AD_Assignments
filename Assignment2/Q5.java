import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Recursive Function calling
        int gcd = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
    public static int gcd(int num1, int num2){
        // Base case
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
