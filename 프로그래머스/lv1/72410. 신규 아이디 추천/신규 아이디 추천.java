public class Solution {
	public String solution(String new_id) {
		String answer = "";
		
		// 1단계 new_id의 모든 대문자를 대응되는 소문자
		new_id = new_id.toLowerCase();
		
		// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자
		String myFilter = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
		for(int i = 0; i < new_id.length(); i++) { 	// 문자열이면 ()를 붙이고 배열이면 안 붙인다
			char ch = new_id.charAt(i);
			// i번째 글자가 myFilter에 포함되어 있으면
			// 반대로 생각해보면 myFilter가 i번째 글자를 포함하면이다
			if(myFilter.contains(ch + "")) {
				answer += ch;
			}
		}
		
		// 3단계에서 new_id에서 마침표(.)가 2번이상 연속된 부분을 하나의 마침표(.)로 치환합니다
		
		while (answer.contains("..")) { // ..을 포함하고 있다면
			answer = answer.replace("..", ".");
		}
		
		// 4단계 
		if(answer.startsWith(".")) {
			answer = answer.substring(1);	// a까지
		}
		if(answer.endsWith(".")) {
			answer = answer.substring(0, answer.length() -1); // 2개 전달 받으면 a~ b까지
		}
		
		// 5단계
		if(answer.contentEquals("")) {
			answer = "a";
		}
		
		// 6단계 
		if(answer.length() >= 16) {
			answer = answer.substring(0, 15);
		}
		if(answer.endsWith(".")) {
			answer = answer.substring(0, answer.length() - 1);
		}
		
		// 7단계 길이가 2자 이하라면 3이 될때까지 반복해라
		// new_id의 마지막 문자를 new_id의 길이가 3이 될때까지 반복해서 붙여라
		while(answer.length() < 3) {
			answer += answer.charAt(answer.length() - 1);
		}
		
		
		
		//answer = new_id;
//		System.out.println(answer);
		return answer;
	}
}
