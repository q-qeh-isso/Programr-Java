package AveragePosAndNeg;

public class Average {
	
	public static void main(String[] args) {
		
		int[] nums = new int[]{5,3,-2,-8,1,2,-4,4,-1,1};
		double averagePos = 0.0;
		double averageNeg = 0.0;
		
		
		int countPos = 0;
		int countNeg = 0;
		for(int i = 0; i<nums.length; i++){
			if(nums[i] > 0){
				averagePos += nums[i];
				countPos++;
			} else {
				averageNeg += nums[i];
				countNeg++;
			}
		}
		
		averagePos = averagePos/countPos;
		averageNeg = averageNeg/countNeg;
		
		System.out.println("positivos media: " + averagePos);
		System.out.println("negativos media: " + averageNeg);
		
	}

}
