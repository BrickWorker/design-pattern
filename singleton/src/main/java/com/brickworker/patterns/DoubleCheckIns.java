package com.brickworker.patterns;

/**
 * 双重检查单例
 * @Author tongzhixiang
 * @create 2019-09-05 15:40
 */
public class DoubleCheckIns {
    private static volatile DoubleCheckIns INSTANCE;
    private DoubleCheckIns(){}
    public static DoubleCheckIns getInstance(){
        if(null == INSTANCE){
            synchronized (DoubleCheckIns.class){
                if(null == INSTANCE){
                    INSTANCE = new DoubleCheckIns();
                }
            }
        }
        return INSTANCE;
    }
}
