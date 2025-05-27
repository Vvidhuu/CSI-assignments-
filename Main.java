//PYRAMID
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for (int i = 1; i<=n ; i++) {
            //inner loop
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i -1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/*
// LOWER TRIANGLE
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for (int i = 1; i<=n ; i++) {
            //inner loop
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

// UPPER TRIANGLE
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for (int i = n; i>=1 ; i--) {
            //inner loop
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





