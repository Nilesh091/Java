
//GCD(a,b)=GCD(a-b,b); 
 // Condition: a>b
 // GCD(a,b)= GCD(b,a%b);
public class Rec1 {
    public static void main(String[] args) {
        System.out.println(gcd(24, 60));
    }
    static int gcd(int a,int b){
        if(b==0) 
        return a;
        else 
        return gcd(b,a%b);
    }
}
