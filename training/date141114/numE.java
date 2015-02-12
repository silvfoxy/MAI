package MAI.training.date141114;
//package mai.training141114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by SilvFoxy on 14.11.2014.
 */
public class numE{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        String number = reader.readLine();
        String first="",sec="";

        for(int i = 0, j=(2*len>>1); i<(2*len)>>1; ++i,j++ ){
            first += number.charAt(i);
            sec += number.charAt(j);
        }
        char[] ch1 = first.toCharArray();
        char[] ch2 = sec.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean f= false, f2=false;

        for(int i = 0,j = 0; i<ch1.length; ++i, j++){
            if(ch1[i]<ch2[j] && !f2)f=true;
            else if(ch1[i]>ch2[j] && !f)f2=true;
            else{
                f=false;
                f2=false;
                break;
            }
        }
        if(f||f2)System.out.println("YES");
        else
            System.out.println("NO");
    }
}
