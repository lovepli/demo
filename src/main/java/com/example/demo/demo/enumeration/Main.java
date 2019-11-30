package com.example.demo.demo.enumeration;

/**
 * @author: lipan
 * @date: 2019-06-07
 * @description:
 */
public class Main {

    //没有给neum添加变量之前的测试
    private static void test() {
        //遍历所有常量的数组
        for (Weekdy day : Weekdy.values()) {
            System.out.println(day.name());
        }

        Weekdy fri = Weekdy.FRI;
        //enum -> String
        System.out.println("FRI.name() = " + fri.name());
        //定义时的序号：
        System.out.println("FRI.ordinal() = " + fri.ordinal());
        // String -> enum
        System.out.println(Weekdy.valueOf("FRI").name());
        //不存在的name
        Weekdy.valueOf("ABC");
    }

    public static void main(String[] args) {

        Weekdy fri = Weekdy.FRI;
        System.out.println(fri.toChinese()); //星期五

    }
}
