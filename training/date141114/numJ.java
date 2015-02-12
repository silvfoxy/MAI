package MAI.training.date141114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Srebroliska on 21.11.2014.
 */
public class numJ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n, t, c;
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int cont = 0;
        int res = 0;

        for (int i = 0; i < n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp <= t){
                cont++;
                if (cont == c){
                    res++;
                    cont -= 1;
                }
            }
            else{
                cont = 0;
            }
        }

        System.out.println(res);
    }
}
