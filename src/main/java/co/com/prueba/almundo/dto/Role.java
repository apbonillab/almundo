package co.com.prueba.almundo.dto;

public enum Role {
    OPERADOR(1),
    SUPERVISOR(2),
    DIRECTOR(3);

    private long id;

    public long getId() {
        return id;
    }

    Role(long id) {
        this.id = id;
    }
}
