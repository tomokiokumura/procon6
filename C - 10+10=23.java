import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split(" ");
        int B = Integer.parseInt(br.readLine());
        String[] y = br.readLine().split(" ");
        int C = Integer.parseInt(br.readLine());
        String[] z = br.readLine().split(" ");
        int K = Integer.parseInt(br.readLine());
        String S = br.readLine();
        String T = br.readLine();

        double sumS = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < x.length; j++) {
                if (S.charAt(i) == x[j].charAt(0)) {
                    sumS += Math.pow((double) A, (double) i) * j;
                }
            }
        }
        double sumT = 0;
        for (int i = 0; i < T.length(); i++) {
            for (int j = 0; j < y.length; j++) {
                if (T.charAt(i) == y[j].charAt(0)) {
                    sumS += Math.pow((double) B, (double) i) * j;
                }
            }
        }
        double sum = sumS + sumT;
        double amari = sum;
        int ans = 0;
        while (amari < C) {
            
        }
    }
}
