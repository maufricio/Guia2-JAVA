package EjercicioPackage;

import javax.swing.*;

public class SueldoEmpleados {
    public static void main(String[] args) throws NumberFormatException {
        try{

                String leer;
                double sueldo, mayor = 0, menor = 1000;
                int i= 1, contador = 0;


                while(i <= 5){
                    try{
                        leer = JOptionPane.showInputDialog("Ingrese el sueldo del Empleado " +i);
                        sueldo = Double.parseDouble(leer);
                        if(sueldo > 0){
                            if(sueldo > 300)
                                contador = contador +1;
                            if(sueldo > mayor)
                                mayor = sueldo;
                            if(sueldo < menor)
                                menor = sueldo;
                            i = i + 1;
                        }else{
                            System.out.println("Error: No se aceptan numeros negativos.");
                        }
                    }catch (NumberFormatException n){
                        throw new NumberFormatException("Error: " + n.getMessage());
                    }

                }

                JOptionPane.showMessageDialog(null, "El sueldo Mayor es de $: " + mayor + "\nEl sueldo Menor es de $: " + menor +
                        "\n"+ contador + " Empleados tienen un sueldo mayor de $300");


        }catch(NumberFormatException e){
            throw new NumberFormatException("Error: " + e.getMessage());
        }finally{
            System.out.println("Programa terminado.");
            System.exit(0);
        }

    }
}
