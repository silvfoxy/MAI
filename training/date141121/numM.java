package MAI.training.date211114;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 21.11.2014.
 */
public class numM {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr=new int[m];
        int[] ans=new int[n];
        int r=0;

        st = new StringTokenizer(reader.readLine());
        for(int i=0;i<m;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            for(int j=0;j<=(n-arr[i]);j++){
                if((ans[arr[i]-1+j])==0){
                    ans[arr[i]-1+j]=arr[i];
                }
            }
        }
        for(int y=0;y<n;y++){
            System.out.print(ans[y]+" ");
        }
    }
}
