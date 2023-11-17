import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Base");
        double b=sc.nextInt();
        System.out.println("Enter the Power");
        double p=sc.nextInt();
        System.out.println(p+"th power of "+b+" is "+power(b,p));
    }
    public static double power(double base,double pow){
        if(pow==0){
            return 1;
        }
        return base*(Math.pow(base,pow-1));
    }
}
