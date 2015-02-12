//package MAI.training.date281114;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * Created by FokinaA on 28.11.2014.
 */
public class numH {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        PriorityQueue<User> q = new PriorityQueue<User>();
        int[] b = new int[n];
        for(int i = 0 ; i  < n;i++)
        {
            int a = Integer.parseInt(st.nextToken());
            q.add(new User(i, a));
        }
        int min = 0;
        while(!q.isEmpty())
        {
            User s=  q.poll();
            min = Math.max(min, s.a);
            b[s.i] = min++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i =  0; i  < n;i++)
            sb.append(b[i]+(i<n-1? " ":""));
        System.out.println(sb);
    }
    static class User implements Comparable<User>
    {
        int i;
        int a;
        public User(int i , int a)
        {
            this.i = i;
            this.a = a;
        }
        public int compareTo(User o)
        {
            return a-o.a;
        }
    }
}
