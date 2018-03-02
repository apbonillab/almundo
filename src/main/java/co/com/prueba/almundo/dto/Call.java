package co.com.prueba.almundo.dto;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Call {
    private Semaphore role;
    private CyclicBarrier standBy;
    private String messsage;

    public Semaphore getRole() {
        return role;
    }

    public void setRole(Semaphore role) {
        this.role = role;
    }

    public CyclicBarrier getStandBy() {
        return standBy;
    }

    public void setStandBy(CyclicBarrier standBy) {
        this.standBy = standBy;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }
}
