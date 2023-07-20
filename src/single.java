package SingleNumber;

import java.util.Scanner;

public class single {

    public static int Singlenumber(int[]A) {

        int result =0;
        for(int i=0;i<A.length;i++) {
            result=result^A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner B=new Scanner(System.in);
        int n=B.nextInt();
        int[]A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=B.nextInt();
        }
        int value=Singlenumber(A);
        System.out.println(value);
    }


}