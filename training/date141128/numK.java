//package MAI.training.date281114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 28.11.2014.
 */
public class numK {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] nums = new int[1001];
        int max = 0;
        int ind;
        for (int i = 0 ; i < n ; i++) {
            ind = Integer.parseInt(st.nextToken()) - 1;
            nums[ind]++;
            if(nums[ind] > max)
                max = nums[ind];
        }
        if(max > (n+1) / 2)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
