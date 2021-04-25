
//https://www.hackerrank.com/challenges/alternating-characters/problem
public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int alternatingCharacters(String s) {
		
		int count = 0; 
		
		//public char charAt(int index) : This method returns the character located at the String's specified index. The string indexes start from zero.
	    for(int i=0;i<s.length()-1;i++){
	    	if(s.charAt(i)==s.charAt(i+1)){
	         	count++;
	        }
	    }
	    return count;
	}

}
