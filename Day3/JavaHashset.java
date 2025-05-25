import java.io.*;
import java.util.*;

public class JavaHashset {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().trim().split(" ");
            String a = tokens[0];
            String b = tokens[1];
            String pair = (a.compareTo(b) < 0) ? a + " " + b : b + " " + a;

            set.add(pair);
            System.out.println(set.size());
        }
    }
}
