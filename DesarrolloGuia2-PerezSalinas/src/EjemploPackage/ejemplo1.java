package EjemploPackage;

import java.util.*;
public class ejemplo1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int Var1, Var2;
        System.out.print("Ingrese numero1: ");
        Var1 = reader.nextInt();
        System.out.print("Ingrese numero2: ");
        Var2 = reader.nextInt();
        if(Var1 == Var2)
            System.out.println("Los numeros son iguales");
        else
            System.out.println("Los numeros ingresados no son iguales");
    }
}
