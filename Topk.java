import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Topk {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3};
        int k = 3;

        System.out.println(Arrays.toString(Freq(arr,k)));
    }

    private static int[] Freq(int[] arr, int k) {
      Map<Integer,Integer> Hash = new HashMap<>();
      for(int n: arr){
      Hash.put(n, Hash.getOrDefault(n,0) + 1);
      }
      Queue<Integer> Heap = new PriorityQueue<>(
        (a,b) -> Hash.get(a) - Hash.get(b)
      );

      for(int n: Hash.keySet()){
        Heap.add(n);
        if(Heap.size() > k){
            Heap.poll();
        }
      }


      int[] ans = new int[Heap.size()];
      for(int i = 0; i <= Heap.size() + 1; i++){
          ans[i] = Heap.poll();
      }

        return ans;
    }
}
