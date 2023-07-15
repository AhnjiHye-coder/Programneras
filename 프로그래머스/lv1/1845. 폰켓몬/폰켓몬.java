

import java.util.HashMap;
import java.util.HashSet;

class Solution {
	/*
	 	 연구실에 있는 총 N마리의 포멧몬 중에서 N/2마리를 가져도 좋다
	 	 최대한 많은 종류의 포켓몬을 포함하여 N/2마리를 선택해야 한다
	 	 
	 	 N/2마리의 포멧몬을 선택하는 방법 중, 가장 많은 종류의 포멧몬을 선택하는 방법에서
	 	 포켓몬 종류번호의 개수 return
	 */
	
	public int solution(int[] nums) {
		
		int answer = 0;
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int num : nums) {
			map.put(num + "번 폰켓몬", map.getOrDefault(num + "번 폰켓몬", 0) + 1);
		}
		System.out.println(map);
        
		
		int n = nums.length / 2;		// 전체 마리수의 절반만 가져갈 수 있
		int m = map.size();				// map에서 value의 역할이 없어서 set으로 바꿔서 작성함
		
		answer = n > m ? m : n ;
		
		return answer;
	}
}

