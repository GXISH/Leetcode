package cn.leetcode.yuh.utils;

import java.util.function.Supplier;

public class CommonUtils {


    public static <T> T countTime(Supplier<T> function) {
        long startTime = System.nanoTime(); // 记录开始时间
        T result = function.get(); // 执行方法并获取结果
        long endTime = System.nanoTime(); // 记录结束时间

        double v = Double.parseDouble(String.valueOf(endTime - startTime));// 计算执行时间
        System.out.println("耗时: " + v / 1000000 + " 毫秒");

        return result; // 返回方法的原始结果
    }


}
