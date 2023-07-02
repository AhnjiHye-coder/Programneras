class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int z = 0, w = 0;
        
        for(int i : lottos) {
        	if(i == 0) {
        		z++;
        	}
        	else {
        		for(int j : win_nums) {
        			if( i == j) {	
        				w++;
        				break;
        			}
        		}
        		
        	}
        }
        // 예 ) 배열은 6개 짜리이고 w에서 + 된 경우가 4라면 z에서 + 되는 경우는 2인 것이다
        // 그러므로 6이 1보다 크기 때문에 첫번째는 무조건 1등이 나오게 만든 answer[0]것이다
       answer[0] = (w+z) > 1 ? 7 - (w+z) : 6;
        // 만약 w인 내 점수가 로또 번호와 1개도 맞지 않다면 6으로 반환되어 6등이 된다
        // 내 번호에 알수 없는 번호가 없고 맞춘 개수는 4개 라면
        // 7-4의 결과인 3이 내 최저순위인 것이다
       answer[1] = w > 1 ? 7 - w : 6; 
        return answer;
    }
}