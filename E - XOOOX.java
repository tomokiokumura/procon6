import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]), M = Integer.parseInt(NM[1]);
        int K = Integer.parseInt(br.readLine());
        String[][] strA = new String[K][2];
        int[][] a = new Integer[K][2];
        int[][] board = new Integer[N][M];
        for (int i = 0; i < K; i++) {
            strA = br.readLine().split(" ");
            a[i][0] = Integer.parseInt(strA[i][0]);
            a[i][1] = Integer.parseInt(strA[i][1]);
            if (i % 2 == 0) {
                board[a[i][0]][a[i][1]] = 1;
            } else {
                board[a[i][0]][a[i][1]] = -1;
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                
            }
        }
    }
}
