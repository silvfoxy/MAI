package something;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FokinaA on 14.12.2014.
 */
public class lab14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;//Integer.parseInt(bf.readLine());
        int[][] arr;
        //arr = new int[][]{{16, 14, 10, 4}, {13, 9, 3, 5}, {8, 2, 6, 11}, {1, 7, 12, 15}};
        //arr = new int[][]{{9, 7, 3}, {6, 2, 4}, {1, 5, 8}};
        arr = new int[][]{{25, 23, 19, 13, 5}, {22, 18, 12, 4, 6}, {17, 11, 3, 7, 14}, {10, 2, 8, 15, 20}, {1, 9, 16, 21, 24}};
        for (int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //int diag_length=n;//длина диагонали
        //int diag_count=2*n-1;//количество диагоналей
        int dc_iter=n-1;//в начале находится на диагонали, обратной главной.
        int jump_length=1;//счетчик того, на сколько диагоналей вверх или вниз нужно перескочить
        int direction=1;//показывает, в какую сторону нужно двигаться по диагонали. вверх: 1, вниз: -1.
        int count=0;//счетчик количества напечатанных ячеек
        int another_cnt=1;//счетчик строки для тех случаев, когда диагональ направлена вниз.
        while (count<n*n) {
            if(direction>0){
                int i=dc_iter;
                int j=0;
                while(i>=0){
                    while(j<n){
                        System.out.print(arr[i][j] + " ");
                        count++;
                        i--; j++;
                        break;
                    }
                }
            }
            if(direction<0){
                int i=another_cnt;
                int j=n-1;
                while(i<n){
                    while(j >= another_cnt){
                        System.out.print(arr[i][j] + " ");
                        count++;
                        i++; j--;
                        break;
                    }
                }
                another_cnt++;
            }
            dc_iter+=direction*jump_length;
            direction*=-1;
            jump_length++;
        }
    }
}
