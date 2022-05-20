import java.util.Scanner;

import javax.swing.JOptionPane;

public class Punto4 {
    Scanner entrada = new Scanner(System.in);

    String nombre;
    int operacion;
    double ingreso, retiro;
    double total;

    String [] titulares = {"Valentina Villa", "Alejandro Restrepo", "Paula Granados",
    "Alexander Villa", "Carlos Villanueva"};

    double [] cantidades = {18000000, 23000000, 9000000, 5000000, 12000000};

    public String preguntarNombre() {
        nombre = JOptionPane.showInputDialog("Digite su nombre completo");
        /* System.out.println("Digite su nombre completo");
        nombre = entrada.nextLine(); */
        return nombre;
    }

    int indexInformacion = -1;

    public int recorrerNombre (String nombre) {

        for (int i = 0; i < titulares.length; i++) {
            if (titulares[i].equals(nombre)) {
                indexInformacion = i;
            }
        }
        return indexInformacion;
    }

    public void elegirOperacion () {

        do {
            int operacion = Integer.parseInt(JOptionPane.showInputDialog("¿Que operación desea realizar?\n" + 
            "1. Ingreso\n" +
            "2. Retiro\n" +
            "3. Consultar valor")); 

            switch (operacion) {
                case 1:
                    float ingreso =Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto dinero desea ingresar a su cuenta?"));
                    if (ingreso > 0) {
                        JOptionPane.showMessageDialog(null, "INGRESO EXITOSO\n" + "Acaba de ingresar " + ingreso + " pesos a su cuenta.");
                        total = (cantidades [indexInformacion] + ingreso);
                        cantidades[indexInformacion] = (int) total;
                        JOptionPane.showMessageDialog(null, "Teniendo en cuenta el monto ingresado a la cuenta, ahora usted tiene: \n" + total + "COP" );
                     } else {
                        JOptionPane.showMessageDialog(null, "INGRESO FALLIDO\n" + "Debe ingresar un monto mayor a 0 pesos");
                     }
                    break;
    
                case 2:
                    float retiro =Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto dinero desea retirar de su cuenta?"));
                    if (retiro > cantidades [0]) {
                        JOptionPane.showMessageDialog(null, "RETIRO FALLIDO\n" + "Solo puede retirar un monto igual o menor a la cantidad que tiene en su cuenta");
                    } else {
                        JOptionPane.showMessageDialog(null, "RETIRO EXITOSO\n" + "Acaba de retirar " + retiro + " pesos de su cuenta.");
                        total = cantidades [indexInformacion] - retiro;
                        cantidades[indexInformacion] = (int) total;
                        JOptionPane.showMessageDialog(null, "Teniendo en cuenta el monto retirado de la cuenta, ahora usted tiene: \n" + total + "COP");
                    }
                    break;
    
                case 3:
                    JOptionPane.showMessageDialog(null, "El monto total que tiene en su cuenta es de: " + cantidades[indexInformacion] +" COP.");
                    break;

                default:
                JOptionPane.showMessageDialog(null, "¡INCORRECTO\n!" + "Por favor ingrese una opción que se encuentre en el menú dado.");
                    break;
            }
            
        } while (operacion < 4);

        
    }


}
