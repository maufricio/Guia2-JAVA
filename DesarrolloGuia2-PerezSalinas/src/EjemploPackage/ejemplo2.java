package EjemploPackage;

import javax.swing.JOptionPane;
public class ejemplo2 {
    public static void main(String[] args) {
        String v1 = "";
        v1 = JOptionPane.showInputDialog("Ingrese un valor");
        if(v1 == null)
            JOptionPane.showMessageDialog(null, "Apretaste el botón cancelar");
        else{
            if(v1.equals(""))
                JOptionPane.showMessageDialog(null, "No ingresaste nada.");
            else
                JOptionPane.showMessageDialog(null, "El valor de V1 es: " + v1);
        }
    }
}
