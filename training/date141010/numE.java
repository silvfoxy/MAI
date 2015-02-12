//package ru.codeforces.contest101014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class numE{
    static public void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        BigDecimal bd = new BigDecimal(s);
        BigDecimal sum = new BigDecimal("0");
        bd.setScale(15); sum.setScale(15);
        try{
            while(!s.equals(""))
            {
                bd=new BigDecimal(s);
                sum = sum.add(bd);
                s=reader.readLine();
            }
        }catch(Exception e){}
        //System.out.println(new DecimalFormat("#.000000000000000").format(sum).replace(',', '.'));
        System.out.println(sum);
    }
}
