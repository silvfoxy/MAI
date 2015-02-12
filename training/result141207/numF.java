//package MAI.training.result071214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FokinaA on 07.12.2014.
 */
public class numF {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tmp = bf.readLine();
        int v1 = 0, v2 = 0, v3 = 0;
        try {
            while (!tmp.isEmpty()) {
                if (tmp.equals("Sebulba")) v1++;
                else if (tmp.equals("Chebulba")) v2++;
                else if (tmp.equals("Tsebulba")) v3++;
                tmp = bf.readLine();
            }
        }catch(Exception e){}
        if (v1 > v2 && v1 > v3)
            System.out.println("Sebulba");
        else if (v2 > v1 && v2 > v3)
            System.out.println("Chebulba");
        else if (v3 > v2 && v3 > v1)
            System.out.println("Tsebulba");
        else System.out.println("May the Force be with you!");
    }
}