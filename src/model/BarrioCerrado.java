package model;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad{
    private Integer factorMultiplicador;
    private List<Propiedad> propiedades;

    public BarrioCerrado(String calle, Integer numero, Integer factorMultiplicador) {
        super(calle, numero);
        this.factorMultiplicador = factorMultiplicador;
        propiedades = new ArrayList<Propiedad>();

    }

    public void agregarPropiedades (Propiedad propiedad){
        propiedades.add(propiedad);

    }


    @Override
    public Double calcularImpuesto() {
        Double impuestoTotal = 0.0;

        for(Propiedad p : propiedades){
            impuestoTotal += p.calcularImpuesto();
        }
        return impuestoTotal * factorMultiplicador;
    }
}
