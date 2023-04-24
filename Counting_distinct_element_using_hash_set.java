import java.util.*;
public class Counting_distinct_element_using_hash_set {
    public static int Counting_distinct_element_using_hash_set1(int a[],int b[]){
        Set<Integer> s= new HashSet<>();
        for( int x:a){
            s.add(x);
        }
        for(int y:b){
            s.add(y);
        }
        return s.size();
    }
    public static void main(String[] args) {
        int []a={1,2,3,1,2,3};
        int[]b={1,2,3,4};
        int c= Counting_distinct_element_using_hash_set1(a, b);
        System.out.println(c);
    }
}
