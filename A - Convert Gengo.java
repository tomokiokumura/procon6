import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char gengo = str.charAt(0);
        int nen = Integer.parseInt(str.substring(1));
        int year = 0;

        if (gengo == 'M') {
            year += 1868;
        }
        else if (gengo == 'T') {
            year += 1912;
        }
        else if (gengo == 'S') {
            year += 1926;
        }
        else if (gengo == 'H') {
            year += 1989;
        }
        else if (gengo == 'X') {
            year += 2019;
        }

        System.out.println(year + nen - 1);
    }
}
