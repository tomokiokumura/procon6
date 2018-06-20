import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long[] num = new long[3];
        for (int i = 0; i < str.length; i++) {
            num[i] = Long.parseLong(str[i]);
        }

        long sum = 0;
        for (long i = num[0]; i < num[1]; i++) {
            if (i % num[2] == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
