package datesort;

import java.util.Scanner;

public class DateAscending {
	
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);

		System.out.println("Enter the first date(mm/dd/yyyy):");
		String d1=br.nextLine();  

		System.out.println("Enter the second date(mm/dd/yyyy):");
		String d2=br.nextLine();

		String[] d1Arr = d1.split("/");
		int[] d1IntArr = new int[d1Arr.length];
		String[] d2Arr = d2.split("/");
		int[] d2IntArr = new int[d2Arr.length];
		
		for(int i = 0; i<d1Arr.length; i++){
			d1IntArr[i] = Integer.parseInt(d1Arr[i]);
			d2IntArr[i] = Integer.parseInt(d2Arr[i]);
		}
		
		if(d2IntArr[2] == d2IntArr[2]){
		    if(d1IntArr[0] == d2IntArr[0]){
		        if(d1IntArr[1] > d2IntArr[1]){
		            System.out.println(d2);
		            System.out.println(d1); 
		        }
		    }
		} else if(d1IntArr[2] > d2IntArr[2]){
		    System.out.println(d2);
		    System.out.println(d1);
		} else if(d1IntArr[2] < d2IntArr[2]){
		    System.out.println(d1);
		    System.out.println(d2);
		}
	}

}
