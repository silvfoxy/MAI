package MAI.training.date281114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 28.11.2014.
 */
public class numI {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long mod = 1000000007;
        long[] arr = new long[6];
        arr[0]=(x+mod)%mod;
        arr[1]=(y+mod)%mod;
        arr[2]=(y-x+2*mod)%mod;
        arr[3]=(-x+mod)%mod;
        arr[4]=(-y+mod)%mod;
        arr[5]=(x-y+2*mod)%mod;
        long n = Long.parseLong(bf.readLine());
        long ans;
        if (n<=6) ans=arr[(int)n-1];
        else if (n%6==0) ans=arr[5];
        else if (n%6==1) ans=arr[0];
        else if (n%6==2) ans=arr[1];
        else if (n%6==3) ans=arr[2];
        else if (n%6==4) ans=arr[3];
        else ans=arr[4];
        System.out.println(ans);
    }
}
