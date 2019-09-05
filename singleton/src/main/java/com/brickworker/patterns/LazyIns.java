package com.brickworker.patterns;

/**
 * 懒汉式单例。
 * 懒汉：需要使用的时候才进行初始化，不使用不进行初始化
 * @Author tongzhixiang
 * @create 2019-09-05 15:34
 */
public class LazyIns {

    private static LazyIns INSTANCE;

    private LazyIns() {
    }

    public static LazyIns getInstance(){
        if(null == INSTANCE){
            INSTANCE = new LazyIns();
        }
        return INSTANCE;
    }
}
