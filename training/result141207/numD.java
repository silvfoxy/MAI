//package MAI.training.result071214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 07.12.2014.
 */
public class numD {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        if (N==1){
            System.out.println(0);
        }
        if (N==2){
            System.out.println(0);
            System.out.println(10);
        }
        if (N==3){
            System.out.println(0);
            System.out.println(11);
            System.out.println(200);
        }
        if (N==4){
            System.out.println(0);
            System.out.println(12);
            System.out.println(210);
            System.out.println(3010);
        }
        if (N==5){
            System.out.println(0);
            System.out.println(13);
            System.out.println(220);
            System.out.println(3111);
            System.out.println(40200);
        }
        if (N==6){
            System.out.println(0);
            System.out.println(14);
            System.out.println(230);
            System.out.println(3212);
            System.out.println(41210);
            System.out.println(503010);
        }
        if (N==7){
            System.out.println(0);
            System.out.println(15);
            System.out.println(240);
            System.out.println(3313);
            System.out.println(42220);
            System.out.println(513111);
            System.out.println(6040200);
        }
        if (N==8){
            System.out.println(0);
            System.out.println(16);
            System.out.println(250);
            System.out.println(3414);
            System.out.println(43230);
            System.out.println(523212);
            System.out.println(6141210);
            System.out.println(70503010);
        }
        if (N==9){
            System.out.println(0);
            System.out.println(17);
            System.out.println(260);
            System.out.println(3515);
            System.out.println(44240);
            System.out.println(533313);
            System.out.println(6242220);
            System.out.println(71513111);
            System.out.println(806040200);
        }
        if (N==10){
            System.out.println(0);
            System.out.println(18);
            System.out.println(270);
            System.out.println(3616);
            System.out.println(45250);
            System.out.println(543414);
            System.out.println(6343230);
            System.out.println(72523212);
            System.out.println(816141210);
            System.out.println("9070503010");
        }
    }
}