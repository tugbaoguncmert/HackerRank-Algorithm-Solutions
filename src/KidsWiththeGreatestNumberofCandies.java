import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		
	        List<Boolean> ausgabe = new ArrayList<>();
	        int gross=0;
	        
	        for(int i=0; i < candies.length;i++){
	            if(gross < candies[i] ){
	                gross =candies[i];
	            }
	        }
	        
	        for(int i=0; i< candies.length; i++){
	            if(candies[i] + extraCandies >= gross){
	            	ausgabe.add(true);
	            }else{
	            	ausgabe.add(false); 
	               
	            }
	        }
	        
	       return ausgabe;  
	    }
}
