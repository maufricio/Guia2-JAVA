package EjemploPackage;

import java.awt.font.FontRenderContext;
import java.lang.reflect.Array;
import java.util.*;
public class Ejemplolist {
    public static void main(String[] args) {
        ArrayList<String> listaPersona = new ArrayList();
        listaPersona.add("Marie Curie");
        listaPersona.add("Benjamin Franklin");
        listaPersona.add("Marco Antonio");
        listaPersona.add(1, "Juan Murillo");//Este elemento pasa al indice 1, y los demas elementos corren de posicion

        System.out.println("USO DE ARRAYLIST");
        System.out.println("Contenido de lista Persona: " + listaPersona + "\n");

        int pos = listaPersona.indexOf("Benjamin Franklin");
        System.out.println("El indice de Benjamin Franklin es: " + pos);

        //Verificando si la lista está vacia
        boolean check = listaPersona.isEmpty();
        System.out.println("Verificando si ArrayList está vacio: " + check);
        //Obteniendo tamaño de lista
        int size = listaPersona.size();
        System.out.println("El tamaño de listaPersona es: " + size);
        //Verificando si un elemento esta incluido en la lista
        boolean elemento = listaPersona.contains("Marco Antonio");
        System.out.println("Verificando si 'Marco Antonio' está incluido en listaPersona: " + elemento);

        //Obteniendo elemento de una posicion  especifica
        String item = listaPersona.get(0);
        System.out.println("El elemento con indice 0 es: " + item);
        //Recuperando elemnentos del ArrayList
        //Primera forma: usando lazo for

        System.out.println("\n Recuperando elementos del ArrayList con FOR");
        for (int i = 0; i < listaPersona.size(); i++)
            System.out.println("Indice: " + i + " - Elemento: " + listaPersona.get(i));

        //Segunda forma: usando lazo foreach

        System.out.println("\n Recuperando elementos del ArrayList con FOREACH");
        for (String persona : listaPersona)
            System.out.println("Elemento: " + persona);

        //Tercera forma: Usando Iterator
        //hasNext(): devuelve true si hay mas elementos
        //next(): devuelve el siguiente elemento
        System.out.println("\n Recuperando elementos del ArrayList con ITERATOR");
        for (Iterator<String> it = listaPersona.iterator(); it.hasNext();)
            System.out.println("Elemento: " + it.next());

        //reemplazando un elemento
        listaPersona.set(1, "Nikola Tesla");
        System.out.println("\nArrayLista después de reemplazo: " + listaPersona);
        //Eliminando elementos en posicionn 0
        listaPersona.remove(0);
        System.out.println("\nArrayLIst despues de eliminar elemento 0: " + listaPersona);
        //Convirtiendo ArrayList en Array


        String[] simpleArray = listaPersona.toArray(new String[listaPersona.size()]); //inicializando/declarando array para almacenar lista
        System.out.println("\nEl objeto array creado es: " + Arrays.toString(simpleArray));
    }
}
