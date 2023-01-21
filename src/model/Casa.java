package model;

import java.sql.SQLOutput;

public class Casa extends Propiedad {
    private Double montoBaseImpuesto;


    public Casa(String calle, Integer numero, Double montoBaseImpuesto) {
        super(calle, numero);
        this.montoBaseImpuesto = montoBaseImpuesto;
    }



    @Override
    public Double calcularImpuesto() {
        if (getCalle().equals("Av. San Martin")){
            montoBaseImpuesto *= 1.1;
        }
        return montoBaseImpuesto;

    }
}
