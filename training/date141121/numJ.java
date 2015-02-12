package MAI.training.date211114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 21.11.2014.
 */
public class numJ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] week = new int[7];

        st = new StringTokenizer(reader.readLine());
        for(int i=0; i<7; i++){
            week[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        while(n > 0){
            n-=week[count];
            count++;
            if(count == 7){
                count=0;
            }
        }
        if(count == 0){
            System.out.println(7);
        }
        else System.out.println(count);
    }
}
