class Solution {
    public int solution(String my_string) {
        String[] stringArr = my_string.split(" ");
        
        int answer = Integer.parseInt(stringArr[0]);
        
        for(int i = 1; i < stringArr.length; i+=2) {
    	 if(stringArr[i].equals("+")) {
    		 answer += Integer.parseInt(stringArr[i+1]); 
    	 }	
    	 else { 
    		 answer -= Integer.parseInt(stringArr[i+1]); 
    		 
    	 }
    	 
     }
        return answer;
    }
}