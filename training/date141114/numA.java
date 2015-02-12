package MAI.training.date141114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Srebroliska on 21.11.2014.
 */
public class numA {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long mod = 1000000007;

        long[] arr = new long[n+1];
        arr[0]=1;
        arr[1]=1;
        long sum=0;
        for (int i = 2; i <= n; i++) {
            for (int j = Math.max(0, i-k); j <= i-1; j++) {
                sum+=arr[j];
            }
            arr[i]=sum % mod;
            sum=0;
        }

        System.out.println(arr[n]);
    }
}
