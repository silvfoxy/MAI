package MAI.training.date141114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Srebroliska on 21.11.2014.
 */
public class numH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long del=(x*y)/gcd(x,y);
        long res = b/del-(a-1)/del;

        System.out.println(res);
    }

    private static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
