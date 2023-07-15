class Solution{
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[] basket = new int[moves.length];
		
		for(int i = 0; i < moves.length; i++) {
			int index = moves[i] - 1;
			int get = 0;
			for(int j = 0; j < board.length; j++) { 
				if(board[j][index] != 0) {			
					get = board[j][index];			
					board[j][index] = 0;			
					break;							
                }
            }
			for(int j = 0; j < basket.length; j++) {
				if(basket[j] == 0) {
					basket[j] = get;
					break;
				}
			}
			for(int j = 0; j < basket.length; j++) {
				if(basket[j] != 0 && basket[j] == basket[j + 1]) {
					basket[j] = 0;
					basket[j + 1] = 0;
					answer += 2;	
				}
			}		
		}
		return answer;
    }
}