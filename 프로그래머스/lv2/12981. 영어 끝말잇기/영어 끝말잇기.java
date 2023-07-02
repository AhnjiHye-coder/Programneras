
import java.util.HashMap;
import java.util.Map;

class Solution {
   public int[] solution(int n, String[] words) {
	    int[] answer = {0, 0};
	        
	        // 단어 중복 체크를 위한 맵
	        Map<String, Integer> map = new HashMap<>();
	        
	        // 1. 먼저 단어 배열을 대상으로 반복하고, 단어들을 비교해주어야 한다
	        for(int i = 0; i < words.length; i++) {
	        	// 이때 배열에서 0이 아니라면이라는 조건을 둔다
	        	// 0일때는 뒤에 단어도 없고 첫단어이기 때문에 끝말잇기 불가
	        	// 이후 부터 첫단어 마지막 문자와 그 다음 첫 문자를 변수에 담아주며 비교한다
	        	if( i != 0) {
	        		// 단어 배열에서 -1을 하여 현재 내 단어 앞에 있는 문자와
	        		String s1 = words[i-1]; // 전 사람의 단어
	        		// 현재 내 문자를 변수에 담아 비교한다
	        		String s2 = words[i];   // 현재 내 단어
	        		
	        		
	        		// 2. 끝에 말을 이어갔는지 확인.
	        		// 전 단어, 내 단어의 마지막 문자와 내 단어 맨 앞 문자를 각 변수에 담아준다
	        		
	        		// s1은 전 사람의 단어이다
	        		// 전 사람의 단어에서 길이 -1하면 마지막 문자하나이다
	        		// 그 문자를 last에 담는다
	        		char last = s1.charAt(s1.length() - 1);
	        		// 현재 내 단어를 first에 담는다
	        		char first = s2.charAt(0);
	        		
	        		// 3. 각 끝과 첫 문자 하나씩 담은 변수들을 맵에 담고 비교하는데
	        		// containsKey : 현재 키가 맵의 키에 있는지 체크
	        		// map의 key에 현재 단어가 map에 존재한다면 진입하거나(중복이라는 의미)
	        		// 또는 각 단어의 전 사람의 마지막 단어와 내 첫 단어가 일치하지 않는다면 진입
	        		if(map.containsKey(s2) || last != first) {
	        			// 현재 이 조건으로 진입한 사람의 i % n을 하여 번호 + 1해준다(index인한 +1)
	        			answer[0] = (i % n) + 1; // index의 앞
	        			// 그리고 차례도 구해준다
	        			answer[1] = (i / n) + 1; // index의 뒤
	        			
	        			return answer;
	        		}
	        	}
	        	
	        	map.put(words[i], 1); // 맵에 단어 배열을 값을 각각 대입
	        }
	        return answer;
    }
}