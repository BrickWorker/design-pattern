package com.brickworker.patterns;

/**
 * 线程安全单例
 * @Author tongzhixiang
 * @create 2019-09-05 15:42
 */
public class SyncIns {
    private static SyncIns INSTANCE;
    private SyncIns(){}
    public synchronized SyncIns getInstance(){
        if(null == INSTANCE){
            INSTANCE = new SyncIns();
        }
        return INSTANCE;
    }
}
