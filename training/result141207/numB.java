package MAI.training.result071214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 07.12.2014.
 */
public class numB {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long n = Long.parseLong(st.nextToken());
        if (n>2 || n==0) {
            System.out.print("-1");
            System.exit(0);
        }
        else if (n==1) {
            System.out.print("1 2 3");
            System.exit(0);
        }
        else {
            System.out.print("3 4 5");
            System.exit(0);
        }
    }
}
