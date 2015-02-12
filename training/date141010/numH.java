//package ru.codeforces.contest101014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SilvFoxy on 15.10.2014.
 */
public class numH {
    static public void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        System.out.println(IsFib(n));
    }
    public static int IsFib(long n){
        if (n==0) return 0;
        if (n==1) return 1;

        //long fibL=11;
        //String fibS = "11";
        int a = 1; int b = 1;
        int c=a+b; int i=3;

        while (c<=n){
            //fibL = Long.parseLong(fibS);
            if (c==n) return i;
            //fibS+=c;
            a=b;
            b=c;
            c=a+b;
            i++;
        }
        return -1;
    }
}
