package municipalidad.digital;

import FactoryProp.PropiedadFactory;
import model.Municipalidad;

public class Main {
    public static void main(String[] args) {

        Municipalidad municipalidad = new Municipalidad();
        municipalidad.crearPropiedad(PropiedadFactory.AV_SANMARTIN);
        municipalidad.crearPropiedad(PropiedadFactory.MITRE);
        municipalidad.crearPropiedad(PropiedadFactory.BARRIO_CERRADO);
        municipalidad.mostrarPropiedades();
        municipalidad.crearPropiedad("BARRIO_ROCA");






    }
}
