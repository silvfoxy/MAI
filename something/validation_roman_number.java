package something;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FokinaA on 18.01.2015.
 */
//не доделано
public class validation_roman_number {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n = s.length();
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        int[] x = new int[a.length];
        for (int i=0; i<n; i++){
            if(a[i]=='m')
                x[i]=1000;
            else if(a[i]=='d')
                x[i]=500;
            else if(a[i]=='c')
                x[i]=100;
            else if(a[i]=='l')
                x[i]=50;
            else if(a[i]=='x')
                x[i]=10;
            else if(a[i]=='v')
                x[i]=5;
            else if(a[i]=='i')
                x[i]=1;
            else if(a[i]==' ')
                x[i]=0;
        }
        boolean flag = true;
        for (int i=0; i<n; i++) {

        }
    }
}
