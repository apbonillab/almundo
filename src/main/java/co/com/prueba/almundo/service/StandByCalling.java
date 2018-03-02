package co.com.prueba.almundo.service;

import org.springframework.stereotype.Service;

@Service
public class StandByCalling extends Thread {

    @Override
    public void run() {
        System.out.println("un momento por favor la llamada es importante...");
    }
}
