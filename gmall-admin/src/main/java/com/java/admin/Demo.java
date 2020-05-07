package com.java.admin;

import java.util.concurrent.*;

/**
 * @author chubaodong
 * @version v1.0.0
 * @Package : com.java.admin
 * @Description : TODO
 * @Create on : 2020/4/30 11:55
 **/
public class Demo {
    static Integer count = 0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,10,60, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2,Boolean.TRUE), Executors.defaultThreadFactory());

        for (int i = 0; i < 100; i++) {
//            Thread.sleep(3000);
            Future<?> future = threadPoolExecutor.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println(Thread.currentThread().getName()+ " " +count);
                    return count++;
                }
            });
        }

        for (int i = 0; i < 100; i++) {
//            Thread.sleep(3000);
            Future<?> future = threadPoolExecutor.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println(Thread.currentThread().getName()+ " " +count);
                    return count++;
                }
            });
        }
        System.out.println(count);
    }
}
