
//https://leetcode.com/problems/is-subsequence/submissions/

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSubsequence(String s, String t) {
	    
	    int i = 0;       // for traversing String 1
	    int j = 0;       // for traversing String 2
	    
	    while(i<s.length()  && j<t.length()){
	        
	        if(s.charAt(i) == t.charAt(j)){
	            i++;
	            j++;
	        }
	        else
	            j++;
	    }
	    
	    if(i == s.length())    
	        return true;
	    else
	        return false;
	    }

}
