package com.github;

/**
 * 这是一个测试类，主要为了测试单例模式返回的对象是否是相同引用
 */
public class singleton_One_Test {
    public static void main(String[] args) {
        singleton_One one=singleton_One.getInstance();
        singleton_One two=singleton_One.getInstance();
        System.out.println(one==two);
    }
}
