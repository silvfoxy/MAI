package MAI.training.date211114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 25.11.2014.
 */
public class numH {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int s1=Integer.parseInt(st.nextToken());
        int s2=Integer.parseInt(st.nextToken());
        int s3=Integer.parseInt(st.nextToken());
        int a = (int)Math.sqrt(s1*s2/s3);
        int b = (int)Math.sqrt(s1*s3/s2);
        int c = (int)Math.sqrt(s2*s3/s1);
        long res = (a+b+c)*4;
        System.out.print(res);
    }
}
