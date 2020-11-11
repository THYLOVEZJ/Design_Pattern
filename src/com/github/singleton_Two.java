package com.github;

/**
 * 该类创建了一个懒汉式单例模式
 * 懒汉式单例模式是指在私有构造方法里不直接进行实例对象，而在返回实例对象时才进行初始化实例对象
 */
public class singleton_Two {
    private singleton_Two() {

    }

    private static singleton_Two two = null;

    public static singleton_Two getInstance() {
        if (two == null)
            two = new singleton_Two();
        return two;
    }

}
