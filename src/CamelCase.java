
//https://www.hackerrank.com/challenges/camelcase/problem
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int camelcase(String s) {

        int count_word =1;
        
        //boolean isUpperCase(char ch) : This method determines whether the specified char value is uppercase.
        //public char charAt(int index) : This method returns the character located at the String's specified index. The string indexes start from zero.
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count_word++;
            }
        }
        return count_word;
    }

}
