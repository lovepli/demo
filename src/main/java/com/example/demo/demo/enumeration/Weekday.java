package com.example.demo.demo.enumeration;

/**
 * @author: lipan
 * @date: 2019-06-07
 * @description:
 */
public class Weekday {
    //如何定义常量  一:定义整型常量
    public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int YHU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;

    public void f(int day,String color) {
        if (day == Weekday.SUN) {
            System.out.println("今天是星期天！");
        }

    }
}

class Color{
    //如何定义常量  二:定义字符串常量
    public static final String RED = "r";
    public static final String GREEN = "g";
    public static final String BLUE = "b";

    public void f() {
        if ("r".equals(Color.RED)) {
            System.out.println("红色");
        }
    }

    //缺点：编译器无法检查常量的内容，我们如果把"r"改为"R"编译器就会报错

    /**
     * 用enum定义常量
     * 1。关键字enum 定义常量类型
     * 2.常量本身带有类型信息
     * 3。使用 == 比较 if (day == Weekday.SUN) {...}
     *
     * enum定义的类型实际上是从class
     * 1。继承自java.lang.Enum
     * 2。不能通过new 创建实例
     * 3。所有常量都是唯一实例（引用类型）在jvm中只有唯一一个实例，所以我们可以都使用== 来比较
     * 4。可以用于switch语句
     *
     *
     */
    enum Weekdayy{
        SUN, MON, TUE, WED, THU,FRI, SAT;
    }


    /**
     * 假设我们定义了一个Color类型的enum
     * 编译器编译出的class实际是下面这个样子的：
     *
     * 三个静态常量，一个私有构造函数
     * 我们直接编译enum是编译不过的，jvm会做特殊处理
     */

// public enum Colorr{
//        RED, GREEN, BLUE;
//    }

//  piblic  final class Color extends Enum{
//        public static final Color RED = new Color();
//        public static final Color GREEN = new Color();
//        public static final Color BLUE = new Color();
//
//        private Color() {}  //私有的构造方法
//    }
}
