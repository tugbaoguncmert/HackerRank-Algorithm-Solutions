
//https://leetcode.com/problems/two-sum/

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[] twoSum(int[] nums, int target) {
	        
	        int[] ausgabe =new int[2];
	        int current=0;
	        
	       
	        for(int i=0; i<nums.length; i++){
	            for(int j=i+1; j<nums.length; j++){
	                if(nums[i]+nums[j]==target){
	                    ausgabe[0]=i;
	                    ausgabe[1]=j;
	                }
	            }
	        }
	      return ausgabe;
	  }

}
