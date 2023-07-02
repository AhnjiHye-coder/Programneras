class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("a|b|c", "a").replaceAll("a+", " ").trim().split(" ");
        
        // isEmpty는 문자에서 abc만 있을 경우 길이가 0이므로 true를 반환
        if(answer[0].isEmpty()) {
        	answer[0] = "EMPTY";
        }
       
        
        return answer;
    }
}