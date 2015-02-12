package MAI.training.date281114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 28.11.2014.
 */
public class numA {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i]=Long.parseLong(st.nextToken());
        }
        int len = (int)Math.sqrt(n) + 1; //длина каждого "sqrt-отрезка"
        int k = Integer.parseInt(bf.readLine());
        long[]b = new long[len];
        long[] ans = new long[k];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(bf.readLine());
            int l=Integer.parseInt(st.nextToken());
            int r=Integer.parseInt(st.nextToken());
            ans[i]=gcdRQ(l-1, r-1, len, b, nums);
        }
        for (int i = 0; i < k; i++) {
            System.out.println(ans[i]);
        }
    }
    static long getGCD(long a, long b)
    {
        while(a!=0 && b!=0)
        {
            if(a < b)
                b %= a;
            else
                a %= b;
        }
        return a + b;
    }
    static long gcdRQ(int l, int r, int len, long[] b, long[] nums)
    {
        long cur_gcd = nums[l++];
        for(int i = l; i <= r;)
            if (i % len == 0 && i + len - 1 <= r) {
                cur_gcd = getGCD(cur_gcd, b[i / len]);
                i += len; //перескок через "sqrt-отрезок"
            }
            else
                cur_gcd = getGCD(cur_gcd, nums[i++]);
        return cur_gcd;
    }
}
