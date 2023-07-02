class Solution {
   public int solution(int[][] dots) {
	        int answer = 0;
	        
	        int w = 0;
	        int h = 0;
	        int x = dots[0][0];
	        int y = dots[0][1];
	        for(int i = 1; i < dots.length; i++) {
	        	if( x != dots[i][0]) {
	        		// Math : 수학에서 사용하는 함수들이 담겨있는 클래스
	        		// abs : 인자값에 대한 절대값을 반환하는 함수
	        		w = Math.abs(x - dots[i][0]);
	        	}
	        	if(y != dots[i][1]) {
	        		h = Math.abs(y - dots[i][1]);
	        	}
	        }
	        	
	        answer = w * h;
	        
	        
	        return answer;
    }
}