import java.util.Arrays;
import java.util.Scanner;

public class Seive_of_EratoSthenes {
    public static void main(String[] args) {
        int count=0;
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
            boolean new_Array[]= Seive_of_EratoSthenes1(a);
            for(boolean t:new_Array){
                System.out.println(count+":"+t);
                count++;
            }
        }
    }
    static boolean[] Seive_of_EratoSthenes1(int n){
        boolean isPrime[]= new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}
