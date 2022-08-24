package capitalization;

import java.util.Scanner;

public class Capitalize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s;
		s = input.nextLine();
		String reString = "";

		String[] sArr = s.split(" ");
		for (int i = 0; i < sArr.length; i++) {
			String firstLet = sArr[i].substring(0, 1);
			String bodyLet = sArr[i].substring(1);
			sArr[i] = firstLet.toUpperCase() + bodyLet;
		}
		for (int i = 0; i < sArr.length; i++) {
			// reString += sArr[i] + " ";
			if (i == sArr.length - 1) {
				reString += new String(sArr[i]);
			} else {
				reString += new String(sArr[i] + " ");
			}
		}
		System.out.println("Result string:\n" + reString);
	}

}
