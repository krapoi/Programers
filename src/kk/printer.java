package programers;


import java.util.ArrayDeque;
import java.util.Queue;

public class printer {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new ArrayDeque<>();
        int select = location;
        int m = 0;
        for(int i : priorities){
            queue.add(i);
            m = m < i ? i : m;
        }
        int count = 0;
        while(!queue.isEmpty()){

            if(queue.peek() == m){
                count++;
                if(select == 0)
                    return count;
                queue.remove();
                select--;
                m = getMax(queue);
            }
            else {
                int temp = queue.peek();
                queue.remove();
                queue.add(temp);
                if(select == 0) {
                    select = queue.size() - 1;
                    continue;
                }
                select--;
            }
        }
        return count;
    }

    public int getMax(Queue<Integer> queue){
        int max = 0;
        Integer[] arr = queue.toArray(new Integer[0]);
        for (Integer integer : arr) max = integer > max ? integer : max;

        return max;
    }

    public static void main(String[] args) {
        printer p = new printer();
        int[] arr = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        System.out.println(p.solution(arr,1));
    }
}
