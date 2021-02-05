package modelo;

import java.io.File;
import java.util.ArrayList;

public class Utilidades {
    public static ArrayList<String> getArchivos(String ruta){
        File dir = new File(ruta);
        String[] ficheros = dir.list();
        ArrayList<String> imagenes = new ArrayList<String>();
        for (String str :ficheros) {
            if (str.endsWith(".jpg") || str.endsWith(".png")) {
                str = "ficheros".concat(File.separator).concat(str);
                imagenes.add(str);
            }
        }
        return imagenes;
    }
}
