package MAI.training.date211114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 21.11.2014.
 */
public class numN {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] prices=new int[n];
        for(int i=0; i<n; i++){
            prices[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(prices);
        int ind=0;
        st = new StringTokenizer(bf.readLine());
        int m=Integer.parseInt(st.nextToken());
        int ans=0;
        for(int i=0; i<m; i++){
            if(ind<n){
                ans+=prices[ind];
                ind++;
            }
            else{
                ans-=d;
            }
        }
        System.out.println(ans);
    }
}
