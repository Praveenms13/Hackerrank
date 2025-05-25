import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NegativeSubarrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] input = bufferedReader.readLine().trim().split(" ");
        int[] numArr = new int[n];
        for (int i=0;i<n;i++) {
            numArr[i] = Integer.parseInt(input[i]);
        }

        int negativeCount = 0;
        for (int i=0;i<n;i++) {
            int sum = 0;
            for (int j=i;j<n;j++) {
                sum += numArr[j];
                if (sum<0) {
                    negativeCount++;
                }
            }
        }
        System.out.println(negativeCount);
    }
}
