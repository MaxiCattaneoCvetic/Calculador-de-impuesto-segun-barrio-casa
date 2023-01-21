package model;

public abstract class Propiedad {
    private String calle;
    private Integer numero;

    public abstract Double calcularImpuesto();

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public Propiedad(String calle, Integer numero) {
        this.calle = calle;
        this.numero = numero;
    }
}
