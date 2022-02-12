package EjercicioPackage;

import javax.swing.JOptionPane;
public class NotasEstudiantes {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre completo: ");
        String nombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia: ");
        String nota = JOptionPane.showInputDialog("Ingrese la nota de la materia: ");
        double notaConverted = Double.parseDouble(nota);

        if (notaConverted >= 7.0)
            JOptionPane.showMessageDialog(null, "Saludos " +  nombre + ", usted ha aprobado la materia de: " + nombreMateria + " con una nota de: " + notaConverted, "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        else if(notaConverted < 7.0){
            if(notaConverted > 6.50 && notaConverted < 6.99)
                JOptionPane.showMessageDialog(null, "Saludos " +  nombre + ", usted tiene oportunidad de realizar el examen de suficiencia para poder aprobar la materia de: " + nombreMateria , "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Saludos " +  nombre + ", lamentablemente ha reprobado la materia de: " + nombreMateria + " con una nota de: " + notaConverted, "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
