import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int A[]=new int [n];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Maximum number is:"+max(A,n));
        System.out.println("Minimum number is:"+min(A,n));
    }
    public static int min(int[] A,int n){
        if(n==0 || n==1){
            return A[0];
        }
        return Math.min(min(A,n-1),A[n-1]);
    }
    public static int max(int[] A,int n){
        if(n==0 || n==1){
            return A[0];
        }
        return Math.max(max(A,n-1),A[n-1]);
    }
}
