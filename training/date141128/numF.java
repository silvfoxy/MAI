package MAI.training.date281114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 28.11.2014.
 */
public class numF {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if(n < k || (n > 1 && k == 1)) {
            System.out.println(-1);
        }
        else {
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = i & 1;
            }
            int tmp = k - 2;

            for (int i = 0; i < tmp; i++) {
                s[n - tmp + i] = i + 2;
            }
            char[] ans = new char[n];

            for (int i = 0; i < n; i++) {
                ans[i] = (char) (s[i] + 'a');
            }
            System.out.println(new String(ans));
        }
    }
}
