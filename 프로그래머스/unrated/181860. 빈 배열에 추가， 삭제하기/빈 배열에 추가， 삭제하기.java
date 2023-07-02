import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < arr.length; i++) {
			if(flag[i]) { // true 일때 
				// arr배열 i에 * 2를  적용하고
				for(int j = 0; j < arr[i] * 2; j++) {
					// 리스트에 추가
					list.add(arr[i]);
				}
			}
			else { // false일때
				// 배열의 i를
				for(int j = 0; j < arr[i]; j++) {
					list.remove(list.size() -1);
				}
			}
		}
		// 이제 정해진 list의 사이즈를 answer에 적용
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        // 그리고 반환
        return answer;
    }
}