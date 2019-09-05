package com.brickworker.patterns;

/**
 * 静态内部类实现单例
 * @Author tongzhixiang
 * @create 2019-09-05 15:43
 */
public class InnerClazzIns {

    private static final class Holder{
        public static InnerClazzIns INSTANCE = new InnerClazzIns();
    }
    private InnerClazzIns(){}
    public static InnerClazzIns getInstance(){
        return Holder.INSTANCE;
    }
}
