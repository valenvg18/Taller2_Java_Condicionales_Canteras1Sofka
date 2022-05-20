import java.util.Scanner;

public class Punto3 {
    
    String nombre, apellidos;
    int edad;

    public void preguntarNombre () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre?: ");
        nombre = entrada.nextLine();
    }

    public void preguntarApellidos () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuáles son tus apellidos?: ");
        apellidos = entrada.nextLine();
    }

    public void preguntarEdad () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuál es tu edad?: ");
        edad = entrada.nextInt();
    }

    public void mostrarMensaje (String mensaje1, String mensaje2) {
        if (edad >= 18) {
            System.out.println(nombre + " " + apellidos + " " + mensaje1);
        } else {
            System.out.println(nombre + " " + apellidos + " " + mensaje2);
        }
        
    }
}
