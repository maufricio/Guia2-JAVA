package EjercicioPackage;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DescuentosTienda {
    public static void main(String[] args) {
        double formula;
        int lengthInicial = 3, contador = 0;
        ArrayList<String> bolitas = new ArrayList<>();
        bolitas.add("roja");
        bolitas.add("verde");
        bolitas.add("blanca");

        String tirarDados = (String) JOptionPane.showInputDialog(null, "Tirar a la suerte el descuento", "Descuento Tienda", JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"1","2","3"}, "1");
        int numeroDado = Integer.parseInt(tirarDados);

        switch (tirarDados){
            case "1":
                contador = contador + 1;
                formula = ((1 + lengthInicial - 1) / lengthInicial) * numeroDado + contador;
                int resultadoRedondeado = (int) Math.round(formula);
                JOptionPane.showMessageDialog(null, "La bolita que has sacado es de color: " + bolitas.get(resultadoRedondeado));

                if(bolitas.get(resultadoRedondeado) == "verde")
                    JOptionPane.showMessageDialog(null, "A usted se le aplica un 5% de descuento en su compra.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                else if(bolitas.get(resultadoRedondeado) == "roja")
                    JOptionPane.showMessageDialog(null, "A usted se le aplica un 10% de descuento en su compra.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                else if(bolitas.get(resultadoRedondeado) == "blanca")
                    JOptionPane.showMessageDialog(null, "A usted no se le aplica descuento en su compra. Lo sentimos, lo invitamos a seguir particpando, gracias.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                break;
            case "2":
                contador = contador + 1;
                formula = ((0 + lengthInicial - 1) / lengthInicial) * numeroDado;
                resultadoRedondeado = (int) Math.round(formula);
                JOptionPane.showMessageDialog(null, "La bolita que has sacado es de color: " + bolitas.get(resultadoRedondeado));

                if(bolitas.get(resultadoRedondeado) == "verde")
                    JOptionPane.showMessageDialog(null, "A usted se le aplica un 5% de descuento en su compra.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                else if(bolitas.get(resultadoRedondeado) == "roja")
                    JOptionPane.showMessageDialog(null, "A usted se le aplica un 10% de descuento en su compra.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                else if(bolitas.get(resultadoRedondeado) == "blanca")
                    JOptionPane.showMessageDialog(null, "A usted no se le aplica descuento en su compra. Lo sentimos, lo invitamos a seguir particpando, gracias.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                break;
            case "3":
                contador = 0;
                formula = ((2 + lengthInicial - 1) / lengthInicial) * numeroDado - 1;
                resultadoRedondeado = (int) Math.round(formula);
                JOptionPane.showMessageDialog(null, "La bolita que has sacado es de color: " + bolitas.get(resultadoRedondeado));

                if(bolitas.get(resultadoRedondeado) == "verde")
                    JOptionPane.showMessageDialog(null, "A usted se le aplica un 5% de descuento en su compra.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                else if(bolitas.get(resultadoRedondeado) == "roja")
                    JOptionPane.showMessageDialog(null, "A usted se le aplica un 10% de descuento en su compra.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                else if(bolitas.get(resultadoRedondeado) == "blanca")
                    JOptionPane.showMessageDialog(null, "A usted no se le aplica descuento en su compra. Lo sentimos, lo invitamos a seguir particpando, gracias.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
        }


        for(String bolita : bolitas)
            System.out.println(bolita);
    }
}
