package MAI.training.date281114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 28.11.2014.
 */
public class sqrtDec {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=Integer.parseInt(st.nextToken());
        }
        int len = (int)Math.sqrt(n) + 1; //длина каждого "sqrt-отрезка"
        int[] sqrtSums = new int[len]; //массив предпросчитанных сумм
        for(int i = 0; i < n; i++)
            sqrtSums[i / len] += nums[i];

    }
    int getPartSum(int r, int len, int[] sqrtSums, int[] nums)
    {
        int it = 0, res = 0;
        while((it+1) * len -1 <= r)
            res += sqrtSums[it++]; //прибавляем предпосчитанные отрезки, пока можем
        for(int i = it*len; i <=r; i++)
            res += nums[i]; //прибавляем "хвост"
        return res;
    }
    int getSum(int l, int r, int len, int[] sqrtSums, int[] nums)
    {
        if(l == 0)
            return getPartSum(r, len, sqrtSums, nums);
        else
            return getPartSum(r, len, sqrtSums, nums) - getPartSum(l-1, len, sqrtSums, nums);
    }
}
