import javax.swing.JOptionPane;

public class Main_Taller2 {
    public static void main(String[] args) throws Exception {
        
        
        int opcion;

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al taller de Condicionales\n"
            + "Elija que punto del taller desea ver\n"
            + "1. Mayor de edad\n"
            + "2. Menor de edad\n"
            + "3. Entrar a la fiesta\n"
            + "4. Su Banco Fiel\n"
            + "5. Droguería Mi Salud\n"
            + "6. Taller de motos\n"
            + "7. \n"
            + "8. \n"
            + "9. \n"
            + "10. \n"));

            switch (opcion) {
                case 1:
                    Punto1 punto1 = new Punto1();
                    punto1.preguntarEdad();
                    punto1.mostrarMensaje("Usted es mayor de edad");
                    break;

                case 2:
                    Punto2 punto2 = new Punto2();
                    punto2.preguntarEdad();
                    punto2.mostrarMensaje("Usted aún es un niño(a)");
                    break;
                    
                case 3:
                    Punto3 punto3 = new Punto3();
                    punto3.preguntarNombre();
                    punto3.preguntarApellidos();
                    punto3.preguntarEdad();
                    punto3.mostrarMensaje("Usted es mayor de edad, por lo tanto puede entrar a la fiesta", 
                    "Usted es menor de edad, por lo tanto no puede entrar a la fiesta, por favor devuélvase a su casa.");
                    break;

                case 4: 
                
                    Punto4 punto4 = new Punto4();
                    String nombre = punto4.preguntarNombre();  
                    if (punto4.recorrerNombre(nombre) >= 0) {
                        punto4.elegirOperacion();
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario no existe");
                    }
                    break;

                case 5:
                    Punto5 punto5 = new Punto5();
                    int solicitud = punto5.preguntarAccion();

                    switch (solicitud) {
                        case 1:
                            // JOptionPane.showMessageDialog(null, "Ingreso un numero correcto");
                            punto5.elegirProductos();
                            break;
                            
                        case 2:
                            JOptionPane.showMessageDialog(null, "Ingreso un numero correcto");
                            // punto5.devolverProducto();
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Ingreso un numero incorrecto");
                            break;
                    } 

                    break;

                case 6:
                    boolean respuesta_Arreglo = false;
                    boolean rRepuestos = false;
                    String arreglo = "", repuestos = "";
                    String marca, modelo, placa, nombreMoto, observaciones = "", mantener_o_novedad = "";
                    
                    Punto6 punto6 = new Punto6();
                    int solicitudMoto = punto6.escogerSolicitud(); 
                    switch (solicitudMoto) {
                        case 1:
                            
                            int cilindraje = punto6.pedirCilindraje("ingresar");
                            if (cilindraje >= 400) {
                                marca = punto6.pedirMarca("entrada");
                                modelo = punto6.pedirModelo("entrada");
                                placa = punto6.pedirPlaca("entrada");
                                nombreMoto = punto6.pedirNombre();
                                observaciones = punto6.EscribirObs();

                                mantener_o_novedad = punto6.clasificarMoto();

                                respuesta_Arreglo = punto6.preguntarArreglos();

                                if (respuesta_Arreglo == true) {
                                    arreglo = punto6.describirArreglo();
                                    rRepuestos = Boolean.parseBoolean(JOptionPane.showInputDialog("Al realizar el arreglo, ¿Necesitó hacer uso de repuestos?\n" +
                                    "(Escribir 'true' o 'false', según el caso)"));

                                    if (rRepuestos == true) {
                                        repuestos = punto6.describirRepuestos();
                                    } else {
                                        punto6.darSalidad();
                                    }
                                } else {
                                    punto6.darSalidad();
                                }

                                punto6.mostrarMantenimiento(nombreMoto, marca, modelo, cilindraje, placa, observaciones, mantener_o_novedad, arreglo, repuestos);

                                
                            } else {
                                punto6.descartarMoto();
                            }
                            
                            break;

                        case 2:
                            cilindraje = punto6.pedirCilindraje("salir");
                            if (cilindraje >= 400) {
                                marca = punto6.pedirMarca("salida");
                                modelo = punto6.pedirModelo("salida");
                                placa = punto6.pedirPlaca("salida");
                                nombreMoto = punto6.pedirNombre();

                                respuesta_Arreglo = punto6.preguntarArreglos();
                                if (respuesta_Arreglo == true) {
                                    arreglo = punto6.describirArreglo();
                                    rRepuestos = Boolean.parseBoolean(JOptionPane.showInputDialog("Al realizar el arreglo, ¿Necesitó hacer uso de repuestos?\n" +
                                    "(Escribir 'true' o 'false', según el caso)"));

                                    if (rRepuestos == true) {
                                        repuestos = punto6.describirRepuestos();
                                    } else {
                                        punto6.darSalidad();
                                    }
                                } else {
                                    punto6.darSalidad();
                                }

                                punto6.mostrarSalida(nombreMoto, marca, modelo, cilindraje, placa, arreglo, repuestos);

                            } else {
                                JOptionPane.showMessageDialog(null, "Esta moto no pudo haber ingresado al taller,\n" + 
                                "por lo tanto no se le puede dar salida.");
                            }
                            break;
                    
                        default:
                            JOptionPane.showMessageDialog(null, "Opción incorrecta. Elija una opción que esté dentro del menú");
                            break;
                    }

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Esa opcion no se encuentra en el menú");
                    break;
            }
    }   

        

    
}
