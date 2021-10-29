package org.james;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ServidorFicheros implements Servidor {
    // nombre del servidor
    private String nombre;
    private HashMap<String, Fichero> ficheros;
    private Fichero fich;

    public ServidorFicheros(String nombre) {
        this.nombre = nombre;
        ficheros = new HashMap<String, Fichero>();
    }

    public String subir(String nomFich) {
        fich = new Fichero(nomFich);
        ficheros.put(fich.getId(), fich);
        return "\nFichero subido correctamente.";
    }

    public Fichero bajar(String id) {
        return ficheros.get(id);
    }

    public String listado() {
        String lis = "\n### Listado del servidor: " + this.nombre + " ###";
        Collection c = ficheros.values();
        Iterator i = c.iterator();
        while (i.hasNext()) {
            fich = (Fichero) i.next();
            lis += "\n\t" + fich.toString();
        }
        return lis;
    }
}
