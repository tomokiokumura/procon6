import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String regex = "GC|CP|PG";
        StringBuilder sb = new StringBuilder(S);
        Matcher m = Pattern.compile(regex).matcher(sb.toString());

        while (m.find()) {
            sb.delete(m.start(), m.end());
            m = Pattern.compile(regex).matcher(sb.toString());
        }

        System.out.println(sb.length());
    }
}
