import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal");
        int dec=sc.nextInt();
        System.out.println("The HexaDecimal of "+dec+" is "+toHex(dec));
    }
    public static String toHex(int decimal){
        int rem;
        String hex="";
        char hexChars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            rem=decimal%16;
            hex=hexChars[rem]+hex;
            decimal=decimal/16;
        }
        return hex;
    }
}
