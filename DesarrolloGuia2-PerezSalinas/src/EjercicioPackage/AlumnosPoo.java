package EjercicioPackage;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class AlumnosPoo {
    public static void main(String[] args) {
        HashMap<String, String> alumnoInfo = new HashMap<String, String>();
        while(true){
            String menu = (String) JOptionPane.showInputDialog(null, "Seleccione una opción: ", "Menú Inicial", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Ingreso de estudiante", "Ver estudiantes", "Buscar Estudiante", "Salir"}, "Ingreso de estudiante");
                if(menu.equals("Ingreso de estudiante")){
                    String carnet = JOptionPane.showInputDialog(null, "Ingrese carnet de Universidad", "Ingreso de datos", JOptionPane.INFORMATION_MESSAGE);
                    String nombreAlumno = JOptionPane.showInputDialog(null, "Ingrese nombre de alumno", "Ingreso de datos", JOptionPane.INFORMATION_MESSAGE);

                    if(carnet.equals("") || nombreAlumno.equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese los datos respectivos del alumno", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                        alumnoInfo.put(carnet, nombreAlumno);
                        JOptionPane.showMessageDialog(null, "Alumno ingresado exitosamente", "Información exitosa", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else if(menu.equals("Ver estudiantes")){
                    Set set = alumnoInfo.entrySet();
                    Iterator it = set.iterator();

                    while(it.hasNext()){
                        Map.Entry map = (Map.Entry) it.next();
                        JOptionPane.showMessageDialog(null, "Carnet - " + map.getKey() + " - Nombre: " + map.getValue(), "Ver estudiantes", JOptionPane.PLAIN_MESSAGE);
                    }
                }else if(menu.equals("Buscar Estudiante")){
                    String nombreBusqueda = JOptionPane.showInputDialog(null, "Ingrese el carnet o nombre de estudiante a buscar", "Busqueda de Alumno", JOptionPane.PLAIN_MESSAGE);
                    String encontrado = alumnoInfo.get(nombreBusqueda);
                    if(encontrado == null)
                        JOptionPane.showMessageDialog(null, "No se ha hallado ningun alumno con ese número de carnet", "Error", JOptionPane.ERROR_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, nombreBusqueda + " - " + encontrado, "Busqueda de estudiante", JOptionPane.PLAIN_MESSAGE);
                }
                else if(menu.equals("Salir"))
                    System.exit(0);
                else{
                    if(menu == null){
                        try{
                            System.exit(0);
                        }catch(Exception e){
                            System.out.println("Error : " + e.getMessage());
                        }
                    }
                }
        }
    }
}
