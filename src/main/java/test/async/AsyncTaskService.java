package test.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by yangjianzhou on 17-5-16.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        String threadGroupName = Thread.currentThread().getThreadGroup().getName();
        String threadName = Thread.currentThread().getName();
        System.out.println(String.format("execute async task : threadGroupName = %s ,threadName = %s , loop = %s", threadGroupName, threadName, (i + 1)));
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        String threadGroupName = Thread.currentThread().getThreadGroup().getName();
        String threadName = Thread.currentThread().getName();
        System.out.println(String.format("execute async task plus : threadGroupName = %s ,threadName = %s , loop = %s", threadGroupName, threadName, (i + 1)));
    }

}
