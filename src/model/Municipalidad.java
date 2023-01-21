package model;

import FactoryProp.PropiedadFactory;
import exception.PropiedadException;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
    private List<Propiedad> propiedades;


    public Municipalidad (){
        propiedades = new ArrayList<Propiedad>();

    }
    public void crearPropiedad (String propiedad){
        try {
            propiedades.add(PropiedadFactory.getInstance().crearPropiedad(propiedad));

        }catch (PropiedadException e){
            e.printStackTrace();
        }


    }


    public void mostrarPropiedades(){
        System.out.println("Bienvenido al barrio" +"\n");
        for(Propiedad p : propiedades){
            System.out.println("PROPIEDAD: " +p.getCalle()+" " + p.getNumero()+ "\n" +
            "Paga un impuesto de $"+ p.calcularImpuesto() + "\n");
        }
    }

}
