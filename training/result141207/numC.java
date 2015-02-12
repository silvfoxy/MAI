//package MAI.training.result071214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 07.12.2014.
 */
public class numC {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        double grad = 180*(n-2.0)/n; //угол многоугольника
        double sect1 = Math.PI/2*r*r;
        double res=sect1;
        int count=0;
        for (int i = r; i>=0; i=i-a, count++){
            res+=sector(i, 180-grad);
            if (count>=1) res+=sector(i, 180-grad);
        }
        System.out.print(new DecimalFormat("#.000000000000").format(res).replace(',', '.'));
    }
    public static double sector(int r, double n){
        return Math.PI/360*r*r*n;
    }
}
