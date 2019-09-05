package com.brickworker.patterns;

/**
 * 饿汉式单例
 * 饿汉：很饥饿，一开始就创建
 * @Author tongzhixiang
 * @create 2019-09-05 15:37
 */
public class HungryIns {
    private static final HungryIns INSTANCE = new HungryIns();
    private HungryIns(){}
    public static HungryIns getInstance(){
        return INSTANCE;
    }
}
