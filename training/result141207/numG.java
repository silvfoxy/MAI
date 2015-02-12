package MAI.training.result071214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 07.12.2014.
 */
public class numG {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long mod = 1000000009;

        //long[] arr = new long[n+1];
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(0, (long)1);
        arr.add(1, (long)1);
        long sum=0;
        for (long i = 2; i <= n; i++) {
            for (long j = Math.max(0, i-k); j <= i-1; j++) {
                sum+=arr.get((int)j);
            }
            arr.set((int)i, sum % mod);
            sum = 0;
        }
        System.out.println(arr.get((int)n));
    }
}
