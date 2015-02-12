package ru.codeforces.contest101014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SilvFoxy on 16.10.2014.
 */
public class numG {
    static public void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        long m = 1000000007;
        long factorial = 1;
        for (int i=1; i<=n; i++){
            factorial = (factorial*i)%m;
        }
        System.out.println(factorial);
    }
}
