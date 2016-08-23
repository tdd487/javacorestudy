package com.tdd.timer;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2016/8/23.
 */
public class TimerTest {
    public static void main(String args[]) throws IOException {
        Timer timer = new Timer();
        timer.schedule(new MyTask(),1000,2000);
        while(true){
            int in = System.in.read();
            if(in == 's'){
                timer.cancel();
                System.out.println("我不执行了");
                break;
            }
        }
    }
    static class MyTask extends TimerTask{
        public void run() {
            System.out.println("我正在执行");
        }
    }
}
