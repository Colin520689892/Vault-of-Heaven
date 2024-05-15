package com.sky.context;

public class BaseContext {
    //每一个上下文创建了一个线程变量,用来存储long类型的id
    //创建三个方法,用来设置,取用,删除id
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
