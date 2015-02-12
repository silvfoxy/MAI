package ru.codeforces.contest101014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SilvFoxy on 14.10.2014.
 */
public class numD {
    static public void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        int com = 0;
        for (int i=1; i*i<=n; i++) {
            if (n % i == 0) {
                if (i * i == n) com++;
                else com += 2;
            }
        }
        if (n==2) com=2;
        System.out.print(com);
    }
}
