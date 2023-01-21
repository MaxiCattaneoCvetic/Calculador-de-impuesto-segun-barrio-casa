package FactoryProp;

import exception.PropiedadException;
import model.BarrioCerrado;
import model.Casa;
import model.Propiedad;

public class PropiedadFactory {
    private static PropiedadFactory intance;

    public static final String AV_SANMARTIN = "CASA_AVENIDA_SAN_MARTIN";
    public static final String MITRE = "CASA_CALLE_MITRE";
    public static final String BARRIO_CERRADO = "BARRIO_CERRADO";
    private PropiedadFactory() {
    }

    public static PropiedadFactory getInstance(){
        if(intance == null){
            intance = new PropiedadFactory();
        }
        return intance;
    }

    public Propiedad crearPropiedad (String codigoPropiedad) throws PropiedadException {
        switch (codigoPropiedad){
            case AV_SANMARTIN:
                return new Casa("Av. San Martin",130,500.0);
            case MITRE:
                return new Casa("Calle Mitre",233,700.0);
            case BARRIO_CERRADO:
                BarrioCerrado barrio1 = new BarrioCerrado("Gutierres",330,2);
                barrio1.agregarPropiedades(crearPropiedad(AV_SANMARTIN));
                barrio1.agregarPropiedades(crearPropiedad(MITRE));
                return barrio1;
            default:
                throw new PropiedadException("el codigo " +codigoPropiedad + " no es un codigo correcto");
        }
    }




}
