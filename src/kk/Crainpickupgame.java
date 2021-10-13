package kk;

    import java.util.Stack;

public class Crainpickupgame {
    public static int solution(int[][] board, int[] moves) {
        int result = 0;
        Stack<Integer> s = new Stack<>();
        for(int i : moves){
            for(int j = 0; j < board.length; j++){
                if(board[j][i - 1] != 0){
                    if(!s.isEmpty() && s.peek() == board[j][i-1]){
                        s.pop();
                        result += 2;
                    }else {
                        s.add(board[j][i - 1]);
                    }
                    board[j][i-1] = 0;
                    break;
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] bor = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] move = {1,5,3,5,1,2,1,4};

        System.out.println(solution(bor,move));

    }
}
