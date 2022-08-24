package IntAscending;

import java.util.Arrays;
import java.util.Scanner;

public class IntAscending {

	public static void main(String[] args) {
		int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
//        int ini = a;
//        int mid = b;
//        int last = c;
        int[] arr = new int[]{a,b,c};
        Arrays.sort(arr);
         /*if(a>b) {
             mid = a;
         } else if(a>c){
            last = a;
         } else if(b>a) {
             mid = b;
         } else if(b>c){
             last = b;
         } else if(c>a){
             last = c;
         } else if(c>b){
             last = c;
         }*/

        // print stats
        System.out.println("Sorted numbers:");
        //System.out.println(ini + " " + mid + " " + last);
        for(int i = 0; i<arr.length; i++){
        	System.out.print(arr[i]+" ");
        }
	}

}
