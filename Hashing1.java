import java.util.*;
/**
 * Hashing1
 */
public class Hashing1 {

    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(12);
        s.add(134);
        System.out.println(s);
        if(s.contains(12))
        System.out.println("Present");
        else
        System.out.println("Not Present");
        s.remove(134);
        System.out.println(s);
        System.out.println(s.size());
        s.clear();
        System.out.println(s.isEmpty());

    }
}