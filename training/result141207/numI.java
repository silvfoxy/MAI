//package MAI.training.result071214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 07.12.2014.
 */
public class numI {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int size0 = 0, size1 = 0, size2 = 0;
        String s0="", s1="", s2="";
        for (int i = 0; i < n; i++) {
            if(i == 0){
                size0=Integer.parseInt(bf.readLine());
                st = new StringTokenizer(bf.readLine());
                long max1=Integer.parseInt(st.nextToken());
                long max2=max1;
                for (int j = 1; j < size0; j++) {
                    long tmp=Long.parseLong(st.nextToken());
                    if(tmp>max1){
                        max2 = max1;
                        max1 = tmp;
                    }
                    if(tmp>max2 && tmp<max1){
                        max2=tmp;
                    }
                }
                s0 = max2 + " " + max1;
            }
            if(i == 1){
                size1=Integer.parseInt(bf.readLine());
                st = new StringTokenizer(bf.readLine());
                long max1=Integer.parseInt(st.nextToken());
                long max2=max1;
                for (int j = 1; j < size1; j++) {
                    long tmp=Long.parseLong(st.nextToken());
                    if(tmp>max1){
                        max2 = max1;
                        max1 = tmp;
                    }
                    if(tmp>max2 && tmp<max1){
                        max2=tmp;
                    }
                }
                s1 = max2 + " " + max1;
            }
            if(i == 2){
                size2=Integer.parseInt(bf.readLine());
                st = new StringTokenizer(bf.readLine());
                long max1=Integer.parseInt(st.nextToken());
                long max2=max1;
                for (int j = 1; j < size2; j++) {
                    long tmp=Long.parseLong(st.nextToken());
                    if(tmp>max1){
                        max2 = max1;
                        max1 = tmp;
                    }
                    if(tmp>max2 && tmp<max1){
                        max2=tmp;
                    }
                }
                s2 = max2 + " " + max1;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i == 0) System.out.println(s0);
            else if(i == 1) System.out.println(s1);
            else if(i == 2) System.out.println(s2);
        }
    }
}
