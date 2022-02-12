package EjemploPackage;

import javax.swing.JOptionPane;
public class ejemplo12 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Información", "Mensaje De Informacion", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Advertencia", "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sin Icono", "Mensaje de Texto Plano", JOptionPane.PLAIN_MESSAGE);
    }
}
