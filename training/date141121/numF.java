package MAI.training.date211114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 21.11.2014.
 */
public class numF {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int min = arr[0];
        for (int i = 1; i < n; i++)
            min = gcd(min, arr[i]);
        System.out.println(n * min);
    }
    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
