package MAI.training.date211114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FokinaA on 21.11.2014.
 */
public class numE {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int d = s.indexOf('|');
        String left = s.substring(0,d);
        String right = s.substring(d+1);
        s = bf.readLine();

        for(int i = 0; i < s.length();i++)
            if(left.length()<=right.length())
                left += s.charAt(i);
            else
                right += s.charAt(i);

        s = left.length()==right.length() ? left+"|"+right : "Impossible";
        System.out.println(s);
    }
}
