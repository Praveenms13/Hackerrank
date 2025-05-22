import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        Pattern pattern = Pattern.compile(regex);
        for (int i=0;i<n;i++) {
            String sd = sc.nextLine();
            Matcher matcher = pattern.matcher(sd);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
