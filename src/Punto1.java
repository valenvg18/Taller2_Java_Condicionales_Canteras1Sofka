import java.util.Scanner;

import javax.swing.JOptionPane;

public class Punto1 {

    int edad;

    public void preguntarEdad () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Que edad tienes?: ");
        edad = entrada.nextInt();
    }

    public String mostrarMensaje (String mensaje) {
        if (edad >= 18) {
            System.out.println(mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ser mayor de edad para utilizar este programa");
        }
        return mensaje;
    }

    
}
