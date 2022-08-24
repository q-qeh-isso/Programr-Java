package reversearray;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr[] = new int[10];
        Scanner scan= new Scanner(System.in);
        for(int i =0;i<10;i++)
        {
         System.out.println("Enter the array elements["+i+"]:");
         arr[i]=scan.nextInt();
        } 
         //write your logic here
        int tempCurr = 0;
        int tempLast = 0;
         for(int i = 0; i<5; i++){
             tempCurr = arr[i];
             System.out.println("Curr" + tempCurr);
             tempLast = arr[arr.length-1-i];
             System.out.println("Last" + tempLast);
             arr[i] = tempLast;
             arr[arr.length-1-i] = tempCurr;
         }


         //end 
        
        for(int i = 0;i<arr.length; i++)
        {
        System.out.print(arr[i]+" ");
        }
	}

}
