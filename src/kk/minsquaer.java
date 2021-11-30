package programers;

public class minsquaer {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int imax = 0;
        for(int i = 0; i < sizes.length;i++){
            for(int j = 0; j < sizes[i].length;j++){
                if(sizes[i][0] > max)
                    max = sizes[i][0];
                if(sizes[i][1] > imax)
                    imax = sizes[i][1];
            }

        }
        return max * imax;
    }
}
