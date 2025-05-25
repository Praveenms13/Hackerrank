import java.io.*;
import java.util.*;

public class JavaList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        List<Integer> list = new ArrayList<>();
        String[] tokens = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(tokens[i]));
        }
        int op = Integer.parseInt(br.readLine().trim());
        for (int u=0;u<op;u++) {
            String s = br.readLine().trim();
            if (s.equals("Insert")) {
                String[] tokenset = br.readLine().trim().split(" ");
                list.add(Integer.parseInt(tokenset[0]), Integer.parseInt(tokenset[1]));
            }
            if (s.equals("Delete")) {
                list.remove(Integer.parseInt(br.readLine().trim().split(" ")[0]));
            }
        }
        for (int l : list) {
            System.out.print(l + " ");
        }
    }
}