public class Lc289 {
    public void gameOfLife(int[][] board) {
        int[][] temp = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                temp[i][j] = board[i][j];
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                int count = 0;
                for(int a= i-1; a<i+2; a++){
                    for(int b = j-1; b<j+2; b++){
                        if(a>-1 && a<board.length && b>-1 && b<board[0].length){
                            if(temp[a][b] == 1)
                                count++;
                        }
                    }
                }

                if(temp[i][j] == 0){
                    if(count == 3)
                        board[i][j] = 1;
                }
                else{
                    if(count < 3 || count >4)
                        board[i][j] = 0;
                }
            }
        }
    }
}
