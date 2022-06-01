import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public void nextPermutation(int[] nums) {
        List<Integer> tmp = new ArrayList<Integer>();
        if (nums.length == 0) {
            System.out.println(nums);
        }
        int number = 0, num = 0;
        for (int i = 0; i < nums.length; ++i) {
            num = num * 10 + nums[i];
        }
        dfs(tmp, number, nums, num);
        Collections.sort(tmp);
        for (int i = 0; i < tmp.size(); ++i) {
            System.out.println(tmp.get(i));
        }
    }

    public void dfs(List<Integer> tmp, int number, int[] nums, int num) {
        if ((int) Math.log10(number) + 1 == nums.length && number > num) {
            if (number > num) {
                tmp.add(number);
            }
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            number = number * 10 + nums[i];
            dfs(tmp, number, nums, num);
            number /= 10;
            dfs(tmp, number, nums, num);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
