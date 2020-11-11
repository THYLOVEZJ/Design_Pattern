package com.github;

/**
 * 该类主要实现饿汉式单例模式
 * 单例模式主要有以下三个特征
 * 第一：创建私有的构造方法
 * 第二：在类内部创建一个静态实例对象，而对于饿汉式单例模式，应该在创建类的时候就进行初始化
 * 第三：通过一个公有方法，返回这个实例对象
 */
public class singleton_One {
    private singleton_One(){

    }

    private static singleton_One one=new singleton_One();

    public static singleton_One getInstance(){return one;}
}
