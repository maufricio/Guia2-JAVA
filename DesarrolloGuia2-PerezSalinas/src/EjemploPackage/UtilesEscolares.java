package EjemploPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UtilesEscolares {
    public static void main(String[] args) {
        //Declarando HasMap
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //Agregando elementos
        hmap.put(12, "Crayolas");
        hmap.put(2, "Lapices");
        hmap.put(7, "Borradores");
        hmap.put(49, "Colores");
        hmap.put(3, "Boligrafos");

        //Mostrando contenido usando Iterator

        System.out.println("Contenido de HashMap");
        Set set = hmap.entrySet();
        Iterator iterador = set.iterator();

        while(iterador.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterador.next();
            System.out.println("Clave: " + mentry.getKey() + " - Valor: " + mentry.getValue());
        }
        //Obtener valor en base a clave
        String var = hmap.get(2);
        System.out.println("\n Valor asociado a clave 2: " +var);
        //remover elementos en base a clave
        hmap.remove(3);
        System.out.println("\n HashMap despues de eliminar elemento con clave 3: ");
        Set set2 = hmap.entrySet();
        Iterator iterator = set2.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry2 = (Map.Entry) iterator.next();
            System.out.println("Clave: " + mentry2.getKey() + " -Valor: " + mentry2.getValue());
        }
    }
}
