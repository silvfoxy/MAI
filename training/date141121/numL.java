package MAI.training.date211114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 21.11.2014.
 */
public class numL {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        List<Integer> l1 = new ArrayList<Integer>(); //меньше 0
        List<Integer> l2 = new ArrayList<Integer>(); //больше 0
        List<Integer> l3 = new ArrayList<Integer>(); //равно 0
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int data = Integer.parseInt(st.nextToken());
            if (data == 0) l3.add(data);
            else if (data < 0 && flag) {
                l1.add(data); flag=false;
            }
            else if (data < 0 && !flag) l3.add(data);
            else if (data > 0) l2.add(data);
        }
        int ind1=0, ind2=0;
        if (l2.size()==0){
            int size = l3.size();
            boolean ind1b=false, ind2b=false;
            for (int i =0; i<size; i++){
                if (l3.get(i)<0 && (!ind1b || !ind2b)){
                    if (!ind1b){
                        ind1=i;
                        ind1b=true;
                    }
                    else if (!ind2b){
                        ind2=i;
                        ind2b=true;
                    }
                }
            }

            l2.add(l3.get(ind1));
            l2.add(l3.get(ind2));
            l3.remove(ind1);
            l3.remove(ind2-1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l1.size());
        for (int i = 0; i < l1.size(); i++) {
            sb.append(" "+l1.get(i));
        }
        System.out.println(sb);

        sb = new StringBuilder();
        sb.append(l2.size());
        for (int i = 0; i < l2.size(); i++) {
            sb.append(" "+l2.get(i));
        }
        System.out.println(sb);

        sb = new StringBuilder();
        sb.append(l3.size());
        for (int i = 0; i < l3.size(); i++) {
            sb.append(" "+l3.get(i));
        }
        System.out.println(sb);
    }
}
