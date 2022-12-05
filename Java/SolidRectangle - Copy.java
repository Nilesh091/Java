import java.util.*;

public class SolidRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // pattern print
        // outer loop
        for (int i = 1; i <= x; i++) {
            // inner loop
            for (int j = 1; j <= y; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
