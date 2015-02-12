//package MAI.training.date141114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 21.11.2014.
 */
public class numB {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long mod = 1000000007;
        long[] arr = new long[n+1];

        st = new StringTokenizer(bf.readLine());
        int tmp;
        for (int i = 0; i < m; i++) {
            tmp=Integer.parseInt(st.nextToken());
            arr[tmp]=-1;
        }

        arr[0]=1;
        long sum=0;
        for (int i = 1; i <= n; i++) {
            if (arr[i]!=-1) {
                for (int j = Math.max(0, i - k); j <= i - 1; j++) {
                    if (arr[j] != -1)
                        sum += arr[j];
                }
                arr[i] = sum % mod;
                sum = 0;
            }
        }

        System.out.println(arr[n]);
    }
}
