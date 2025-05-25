import java.io.*;
import java.util.*;
import java.math.*;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger k = new BigInteger(sc.next());
        BigInteger h = new BigInteger(sc.next());
        System.out.println(k.add(h));
        System.out.println(k.multiply(h));
    }
}
