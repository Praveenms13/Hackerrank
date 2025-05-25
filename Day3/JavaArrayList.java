import java.io.*;
import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0;i<n;i++) {
            List<Integer> innerList = new ArrayList<>();
            String[] tokens = reader.readLine().trim().split(" ");
            int d =  Integer.parseInt(tokens[0]);
            for (int j=1;j<=d;j++) {
                innerList.add(Integer.parseInt(tokens[j]));
            }
            list.add(innerList);
        }
        int h = Integer.parseInt(reader.readLine().trim());
        for (int i=0;i<h;i++) {
            String[] tokens = reader.readLine().trim().split(" ");
            int row = Integer.parseInt(tokens[0]) - 1;
            int col = Integer.parseInt(tokens[1]) - 1;
            try {
                System.out.println(list.get(row).get(col));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        // System.out.print(list);
    }
}