import java.util.*; 

public class E5<T> extends Lista<T> {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> HT = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num_complement = target - nums[i];
            if (HT.containsKey(num_complement)) {
                return new int[] { HT.get(num_complement), i };
            } else {
                HT.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
