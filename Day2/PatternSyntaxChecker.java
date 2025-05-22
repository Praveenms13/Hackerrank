import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++) {
            String sd = sc.nextLine();
            try {
                Pattern pattern = Pattern.compile(sd);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}
