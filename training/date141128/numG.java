//package MAI.training.date281114;

import java.io.*;

/**
 * Created by FokinaA on 28.11.2014.
 */
public class numG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        args = br.readLine().split(" ");
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int a[] = new int[n];
        args = br.readLine().split(" ");
        boolean is[] = new boolean[100001];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int count[] = new int[n];
        count[count.length - 1] = 1;
        is[a[n - 1]] = true;
        for (int i = count.length - 2; i >= 0; i--) {
            count[i] = count[i + 1];
            if (!is[a[i]]) {
                count[i]++;
                is[a[i]] = true;
            }
        }
        for (int i = 0; i < m; i++) {
            int l = Integer.parseInt(br.readLine());
            out.write(count[l - 1] + "\n");
        }
        out.flush();
        out.close();
    }

}
