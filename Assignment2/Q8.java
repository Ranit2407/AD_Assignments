import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int A[]=new int [n];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Smallest Missing Number is "+findMissing(A,0,n-1));
    }
    public static int findMissing(int A[], int start, int end)
    {
        if (start > end)
            return end + 1;

        if (start != A[start])
            return start;

        int mid = (start + end) / 2;

        // Left half has all elements from 0 to mid
        if (A[mid] == mid)
            return findMissing(A, mid+1, end);

        return findMissing(A, start, mid);
    }
}
