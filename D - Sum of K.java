import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long[] num = new long[3];
        for (int i = 0; i < str.length; i++) {
            num[i] = Long.parseLong(str[i]);
        }

        long A = num[0], B = num[1], K = num[2];
        long a = A >= 0 ? (A + K - 1) / K : A / K;
        long b = B >= 0 ? (B + K - 1) / K : B / K;
        long ans = K * ((b - 1) * b / 2 - (a - 1) * a / 2);
        System.out.println(ans);
    }
}
