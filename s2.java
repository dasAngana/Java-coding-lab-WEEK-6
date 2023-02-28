
import java.util.*;

public class s2 {
 public static void main(String args[]) {

        int[] Arr =new int[10];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<10;i++)
        Arr[i]=sc.nextInt();

        Arrays.sort(Arr);

        int temp[]=new int[10];
        int t=0;

        for(int i=0,j=9;i<j;i++,j--){
            if(t<10){
            temp[t]=Arr[i];
            t++;
            temp[t]=Arr[j];
            t++;
        }}

        for(int i=0;i<10;i++)
        Arr[i]=temp[i];

        for(int i=0;i<10;i++)
        System.out.print(Arr[i]+" ");


 

        
    }
    
}
