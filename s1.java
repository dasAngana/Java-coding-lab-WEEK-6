import java.util.*;
class s1{

    static boolean isPrime(int x){
           
        for(int i=2;i<x;i++)
        if(x%i==0)
        return false;

        return true;
    }

    static boolean CheckSum(int N,int K){
        if(N<K)
        return false;

        if(K==1)
        return isPrime(N);

        if(K==2)
        {
            if(N%2==0)
            return true;

            return isPrime(N-2);
        }

        return true;
    }

    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

       System.out.println(CheckSum(N,K));
    }
}