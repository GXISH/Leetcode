package cn.leetcode.yuh.algorithm;

import cn.leetcode.yuh.utils.CommonUtils;

import java.util.HashMap;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class L0003Medium {

    public static void main(String[] args) {
        L0003Medium l0003Medium = new L0003Medium();
        String s = "dcatudbuawdbanfdwialwauf85f5wq9";
        Integer integer = CommonUtils.countTime(() -> l0003Medium.lengthOfLongestSubstring(s));
        System.out.println(integer);
    }

    //双指针 / 滑动窗口
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int leftIndex = 0;
        //记录重复元素
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
            //获取当前字符
            char c = s.charAt(rightIndex);
            //判断该元素是否以及存在于左右两点之间 若存在 则最左侧节点索引移动到左侧重复元素索引右侧
            if (characterIntegerHashMap.containsKey(c)) {
                leftIndex = Math.max(leftIndex, characterIntegerHashMap.get(c) + 1);
            }
            characterIntegerHashMap.put(c, rightIndex);
            maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
        }
        return maxLength;
    }
}
