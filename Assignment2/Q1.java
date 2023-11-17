import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int A[]=new int [n];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Sum of the Given Numbers are: "+sum(A,n));
    }
    public static int sum(int[] A,int n){
        if(n==0){
            return 0;
        }
        return ( sum(A,n-1)+A[n-1]);
    }
}
