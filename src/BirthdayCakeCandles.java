import java.util.Collections;
import java.util.List;

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int birthdayCakeCandles(List<Integer> candles) {
			
			//Sort from small to large
	        Collections.sort(candles); //import java.util.Collections;  
	        
	        int output =0;	//number of highest candles
	        int max=candles.get(candles.size()-1);
	        
	        for(int i=candles.size()-1;i>=0;i--){
	            if(max == candles.get(i)){
	                output = output + 1;
	            }else{
	                break;
	            }
	        }
	        
	        return output;

	    }

}
