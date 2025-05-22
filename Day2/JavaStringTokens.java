import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.trim().isEmpty()) { System.out.print("0"); return; }
        String[] tokens = str.trim().split("[^a-zA-Z]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }

    }
}
