package MAI.training.result071214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by FokinaA on 07.12.2014.
 */
public class numM {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String s = bf.readLine();
        char[] arr;
        arr = s.toCharArray();
        ArrayList<Character> arr1 = new ArrayList<Character>();
        for (int i=0; i < n; i++){
            char tmp=arr[i];
            if (tmp=='{') arr1.add('}');
            else if (tmp=='(') arr1.add(')');
            else if (tmp=='[') arr1.add(']');
            else if (tmp=='}' || tmp==')' || tmp==']'){
                if (!arr1.isEmpty() && arr1.get(arr1.size()-1)==tmp){
                    arr1.remove(arr1.size()-1);
                }
                else {
                    System.out.println("Nein");
                    System.exit(0);
                }
            }
        }
        if (arr1.size()!=0) System.out.println("Nein");
        else System.out.println("Ja");
    }
}
