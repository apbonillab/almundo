package co.com.prueba.almundo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

@Service
public class CallHandlerService extends  Thread {

    @Autowired
    StandByCalling standByCalling;
    @Override
    public void run(){

    }

    public void call(){


    }


}
