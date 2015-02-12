package MAI.training.result071214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 07.12.2014.
 */
public class numJ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int[][] ar = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0) ar[i][j] = arr[i][j];
                else if(i == 0) ar[i][j] = arr[i][j]+ar[i][j-1];
                else if(j == 0) ar[i][j] = arr[i][j]+ar[i-1][j];
                else ar[i][j] = arr[i][j]+max(ar[i-1][j], ar[i-1][j-1], ar[i][j-1]);
            }
        }
        System.out.println(ar[n-1][m-1]);
    }
    static public int max(int a, int b, int c){
        if (a>b && a>c) return a;
        if (b>a && b>c) return b;
        return c;
    }
}
