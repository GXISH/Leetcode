package cn.leetcode.yuh.algorithm;


/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class L0007Medium {
    public static void main(String[] args) {
        System.out.println(-321 / 10);
        System.out.println(-321 % 10);
        L0007Medium l0007Medium = new L0007Medium();

        int reverse = l0007Medium.reverse(321);
        System.out.println(reverse);
    }

    /**
     * 1.定义一个变量 rev 用于存储反转后的整数，初始值为 0。
     * 2.使用 while 循环处理输入整数 x，当 x 不等于 0 时，执行以下步骤：
     * a. 检查 rev 是否超出整数范围。如果 rev 小于 Integer.MIN_VALUE / 10 或大于 Integer.MAX_VALUE / 10，说明反转后的整数超出整数范围，直接返回 0。
     * b. 取 x 的个位数字 digit，将其存储在变量 digit 中，可以通过 x % 10 计算得出。
     * c. 将 x 除以 10，去掉个位数字。可以通过 x /= 10 更新 x 的值。
     * d. 将 rev 左移一位（即乘以 10），然后加上 digit。可以通过 rev = rev * 10 + digit 更新 rev 的值。
     * 3.当 x 等于 0 时，循环结束，返回反转后的整数 rev。
     */
    public int reverse(int x) {
        // 321
        int rev = 0; // 初始化反转后的整数为 0
        while (x != 0) { // 当 x 不等于 0 时，继续执行循环
            int digit = x % 10; // 取 x 的个位数字
            x /= 10; // 将 x 除以 10，去掉个位数字
            rev = rev * 10 + digit; // 将 rev 左移一位（乘以 10），然后加上个位数字 digit
            System.out.println("拿到最右位: " + digit);
            System.out.println("去除最右位后: " + x);
            System.out.println("当前值: " + rev);
            System.out.println("===============");
        }
        return rev; // 返回反转后的整数
    }

}
