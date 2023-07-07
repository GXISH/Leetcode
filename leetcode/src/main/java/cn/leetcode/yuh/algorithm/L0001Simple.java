package cn.leetcode.yuh.algorithm;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 */
public class L0001Simple {
    public static void main(String[] args) {
        L0001Simple l0001Simple = new L0001Simple();
        int[] nums = {2, 7, 11, 15};
        int[] ints = l0001Simple.twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));
    }

    /**
     *
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<Integer,Integer>();
        //遍历整个数组
        for (int i = 0; i < nums.length; i++) {
            //寻找与之匹配的另一个元素
            int complement = target - nums[i];
            //如果存在则直接返回 如果不存在就将自身加入当其中 等待后续的元素进行匹配 规避掉了自身匹配自神的问题
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(nums[i], i);
        }

        return null;
    }
}
