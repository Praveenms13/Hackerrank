import java.util.*;

public class EOF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            String n = sc.nextLine();
            System.out.println(++i + " " + n);
        }
    }
}