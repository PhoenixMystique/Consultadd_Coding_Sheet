//KMP string matching algorithm
//Time complexity: O(n)
//Space complexity: O(n)
package Day_15;
import java.util.*;

public class kmp_algo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the pattern: ");
        String p = sc.nextLine();
        int n = s.length();
        int m = p.length();
        int lps[] = new int[m];
        int j = 0;
        int i = 1;
        while (i < m) {
            if (p.charAt(i) == p.charAt(j)) {
                lps[i] = j + 1;
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        i = 0;
        j = 0;
        while (i < n) {
            if (s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
            if (j == m) {
                System.out.println("Pattern found at index: " + (i - j));
                j = lps[j - 1];
            }
        }
    }
}
