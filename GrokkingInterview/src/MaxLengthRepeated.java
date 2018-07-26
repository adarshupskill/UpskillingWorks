import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxLengthRepeated {
        public static int maxRepeated(int[] nums1 , int[] nums2){
            int ans = 0;
            Map<Integer ,ArrayList<Integer>> map = new HashMap<>();
            for (int j = 0; j < nums2.length ; j++) {
                map.computeIfAbsent(nums2[j] , x -> new ArrayList<>()).add(j);
            }
            map.size();
            for (int i = 0; i < nums1.length ; i++) {
                if (map.containsKey(nums1[i])){
                    for (int j : map.get(nums1[i])){
                        int k = 0;
                        while (i + k < nums1.length && j + k < nums2.length && nums1[i + k] == nums2[j + k]){
                            k++;
                        }
                        ans = Math.max(ans , k);
                    }
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,1}; int nums2[] = {3,2,1,4,7};
        System.out.println(maxRepeated(nums1 , nums2));
    }
}
