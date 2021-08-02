
// Given two Strings A and B. Find the length of the Longest Common Subsequence
// (LCS) of the given Strings. Input: A = Minneapolis, B = Minnesota.
import java.util.Collections;

public class LongestCommonSubsequence {

    public static int lcs(char[] str1, char[] str2, int s1, int s2) {
        if (s1 == 0 || s2 == 0) {
            return 0;
        }
        if (str1[s1 - 1] == str2[s2 - 1]) {
            return 1 + lcs(str1, str2, s1 - 1, s2 - 1);
        } else {
            return Math.max(lcs(str1, str2, s1, s2 - 1), lcs(str1, str2, s1 - 1, s2));
        }
    }

    public static void main(String[] args) {
        String a = "Minneapolis";
        String b = "Minnesota";
        System.out.println(lcs(a.toCharArray(), b.toCharArray(), a.length(), b.length()));
    }

}