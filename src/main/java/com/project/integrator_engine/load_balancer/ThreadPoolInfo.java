package com.project.integrator_engine.load_balancer;
// we want to know how many threads are available at a time to work with

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class ThreadPoolInfo {

    private final ThreadPoolTaskExecutor taskExecutor;

    @Autowired
    public ThreadPoolInfo( ThreadPoolTaskExecutor threadPoolTaskExecutor){
            this.taskExecutor = threadPoolTaskExecutor;
    }

    //get current available threads
    public int getAvailableThreads(){
        return  this.getMaximumThreads() - taskExecutor.getThreadPoolExecutor().getActiveCount();
    }

    //get maximum available threads
   public  int getMaximumThreads(){
        return taskExecutor.getThreadPoolExecutor().getMaximumPoolSize();
    }
}
