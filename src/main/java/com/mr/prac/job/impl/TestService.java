package com.mr.prac.job.impl;

import com.mr.prac.job.iface.ITestService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhangdong on 2018/5/30.
 */
@Component("testService")
public class TestService implements ITestService {
    @Scheduled(cron = "0/5 * *  * * ? ")
    @Override
    public void test() {
        System.out.println("定时测试");
    }
}
