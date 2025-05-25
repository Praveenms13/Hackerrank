import java.io.*;
import java.util.*;

public class JavaMap {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.nextLine();
            long val = sc.nextLong();
            sc.nextLine();
            map.put(key, val);
        }

        while (sc.hasNextLine()) {
            String key = sc.nextLine();
            if (map.containsKey(key)) {
                System.out.println(key + "=" + map.get(key));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
