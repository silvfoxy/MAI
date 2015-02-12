package ru.codeforces.contest101014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by SilvFoxy on 14.10.2014.
 */
public class numB {
    static public void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        long sum=0;
        if (n>0) {
            String s = reader.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
        /*while(st.hasMoreTokens()) {
            sum += Long.parseLong(st.nextToken());
        }*/
            for (int i = 0; i < n; i++)
                sum += Long.parseLong(st.nextToken());
        }
        System.out.print(sum);
    }
}
