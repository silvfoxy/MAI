//package ru.codeforces.contest101014;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by SilvFoxy on 14.10.2014.
 */
public class numA {
    static public void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(); int y1 = in.nextInt(); int x2 = in.nextInt(); int y2 = in.nextInt();
        int x3 = in.nextInt(); int y3 = in.nextInt(); int x4 = in.nextInt(); int y4 = in.nextInt();
        int xP=0; int yP=0; int sP;
        /*if (areIntersect(x1, x2, x3, x4))*/ xP=length(areIntersectLeft(x1, x2, x3, x4), areIntersectRight(x1, x2, x3, x4));
        /*if (areIntersect(y1, y2, y3, y4))*/ yP=length(areIntersectLeft(y1, y2, y3, y4), areIntersectRight(y1, y2, y3, y4));
        sP=xP*yP;
        System.out.println(sP);
    }
    static public int min(int a, int b){
        if (a<b) return a;
        return b;
    }
    static public int max(int a, int b){
        if (a<b) return b;
        return a;
    }
    static public int areIntersectRight(int x1, int x2, int x3, int x4){
        if (max(x1, x2)>min(x3, x4) && min(x1, x2)<max(x3, x4)){
            if (max(x1, x3)<min(x2, x4)) return min(x2, x4);
            if (max(x2, x4)<min(x1, x3)) return min(x1, x3);
            if (max(x2, x3)<min(x1, x4)) return min(x1, x4);
            if (max(x1, x4)<min(x2, x3)) return min(x2, x3);
        }
        return 0;
    }
    static public int areIntersectLeft(int x1, int x2, int x3, int x4){
        if (max(x1, x2)>min(x3, x4) && min(x1, x2)<max(x3, x4)){
            if (max(x1, x3)<min(x2, x4)) return max(x1, x3);
            if (max(x2, x4)<min(x1, x3)) return max(x2, x4);
            if (max(x2, x3)<min(x1, x4)) return max(x2, x3);
            if (max(x1, x4)<min(x2, x3)) return max(x1, x4);
        }
        return 0;
    }
    /*static public boolean areIntersect(int x1, int x2, int x3, int x4){
        if (max(x1, x2)>min(x3, x4) && min(x1, x2)<max(x3, x4))
            return true;
        return false;
    }*/

    static public int length(int a, int b){
        boolean flag1 = false;
        boolean flag2 = false;
        if (a<0){
            a = a*(-1);
            flag1 = true;
        }
        if (b<0) {
            b = b * (-1);
            flag2 = true;
        }
        //if (flag1 && flag2) return max(a, b)-min(a, b);
        if (flag1 || flag2) return a+b;
        return max(a, b)-min(a, b);
    }
}
