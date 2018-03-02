package co.com.prueba.almundo.service;

import co.com.prueba.almundo.dto.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;

@Service
public class CallingServce extends Thread {

    private Call call;
    @Autowired
    StandByCalling standByCalling;

    CyclicBarrier standByMessage;
    private Semaphore operators;

    public Call getCalling(String message) {
        Semaphore operators = new Semaphore(8);
        CyclicBarrier standbyMessage = new CyclicBarrier(3, standByCalling);
        System.out.println("listo");

        System.out.println("operador:" + operators.availablePermits());
        Call calling = new Call();
        call.setMesssage(message);
        call.setRole(operators);
        call.setStandBy(standbyMessage);
        return call;
    }

    @Override
    public void run() {
        long duration = ThreadLocalRandom.current().nextLong(1,10);

        try {
            standByMessage.await();
            System.out.println("calling");
            operators.acquire();
            Thread.sleep(TimeUnit.SECONDS.toMillis(duration));
            System.out.println("calling dos");
            operators.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
