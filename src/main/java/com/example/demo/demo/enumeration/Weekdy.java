package com.example.demo.demo.enumeration;

/**
 * @author: lipan
 * @date: 2019-06-07
 * @description:
 */
public enum Weekdy {
    SUN("星期日"), MON("星期一"), TUE("星期二"), WED("星期三"), THU("星期四"),FRI("星期五"), SAT("星期六");

    //为枚举类添加字段和方法
    //为每一个枚举类型天就又一个中文名称
    private String chinese;

    //定义一个私有的构造方法来初始化这个字段 private!!!   enum内的=构造方法必须声明为 private
    private Weekdy(String chinese) {
        this.chinese = chinese;
    }

    //定义一个public方法来访问这个字段 在这个方法之前，必须为实例添加变量  SUN -> SUN("星期1" )
    public String toChinese() {
        return chinese;
    }


}
