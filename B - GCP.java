import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String str = new String();

        Deque<Character> deque = new ArrayDeque<>();
        deque.push(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            if (deque.peekFirst() != null) {
                str = deque.peekFirst().toString() + S.charAt(i);
                if (str.equals("GC") || str.equals("CP") || str.equals("PG")) {
                    deque.pop();
                } else {
                    deque.push(S.charAt(i));
                }
            } else {
                deque.push(S.charAt(i));
            }
        }

        System.out.println(deque.size());
    }
}
