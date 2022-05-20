import javax.swing.JOptionPane;

public class Punto6 {
    
    int solicitudMoto, cilindraje, razon;
    String marca, modelo, placa, nombreMoto, observaciones;
    String respuesta, mantenimiento, novedad, mantener_o_novedad, arreglo, repuestos;
    boolean respuesta_Arreglos = false;

    String mantenimientoG = "Mantenimiento General";
    String PMotor = "Problema en el motor";
    String PFrenos = "Problemas con los frenos o cambio de pastas";
    String PFiltro = "Anomalías con el filtro o cambio de este";
    String cadena = "Problema en la cadena";

    public int escogerSolicitud () {
        solicitudMoto = Integer.parseInt(JOptionPane.showInputDialog("TALLER EL MAQUINISTA\n" +
        "¿Que solicitud desea realizar?\n" +
        "1. Moto para ingresar al taller\n" +
        "2. Moto para darle salida del taller")); 
        return solicitudMoto;
    }

    public int pedirCilindraje (String entradaSalida) {
        cilindraje = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el cilindraje de la moto que se va a "+ entradaSalida +"?"));
        return cilindraje;
    }

    public String pedirMarca (String entradaSalida) {
        marca = JOptionPane.showInputDialog("¿Que marca es la moto a la cual se le dará " + entradaSalida + "?"); 
        return marca;
    }

    public String pedirModelo (String entradaSalida) {
        modelo = JOptionPane.showInputDialog("¿Que modelo es la moto a la cual se le dará "+ entradaSalida +"?");
        return modelo;
    }

    public String pedirPlaca (String entradaSalida) {
        placa = JOptionPane.showInputDialog("¿Que placa tiene a la cual se le dará "+ entradaSalida +"?");
        return placa;
    }

    public String pedirNombre () {
        nombreMoto = JOptionPane.showInputDialog("¿Cuál es el nombre completo del propietario de la moto?");
        return nombreMoto;
    }

    public String EscribirObs () {
        observaciones = JOptionPane.showInputDialog("¿Cuáles fueron las observaciones por parte del propietario de la moto?");
       return observaciones;
    }

    public String preguntarNecesidad (String tipoArreglo) {
        respuesta = JOptionPane.showInputDialog("¿La moto solo tuvo "+ tipoArreglo + "?\n" + "(Responder si o no según el caso)");
        return respuesta;
    }

    
    

    

    public String describirProceso () {
        mantenimiento = JOptionPane.showInputDialog("Describa el procedimiento que se le realizará a la moto"); 
        return mantenimiento;
    }

    public String describirNovedad () {
        novedad = JOptionPane.showInputDialog("Describa la novedad encontrada en la motocicleta"); 
        return novedad;
    }

    public String verificarRespuesta () {
        Punto6 moto = new Punto6();
        if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("Si") ) {
            mantenimiento = moto.describirProceso();
        } else {
            novedad = moto.describirNovedad();
        }
        return mantener_o_novedad;
    }


    public String clasificarMoto () {
        Punto6 moto = new Punto6();
        razon = Integer.parseInt(JOptionPane.showInputDialog("La moto que ingreso al taller, según las observaciones del propietario,  se puede clasificar como:\n" + 
        "1. " + mantenimientoG + 
		"\n2. " + PMotor +
		"\n3. " + PFrenos +
		"\n4. " + PFiltro +
		"\n5. " + cadena));

        switch (razon) {
            case 1:
                respuesta = moto.preguntarNecesidad(mantenimientoG);
                mantener_o_novedad = moto.verificarRespuesta();
                break;

            case 2:
                respuesta = moto.preguntarNecesidad(PMotor);
                mantener_o_novedad = moto.verificarRespuesta();
                break; 

            case 3:
                respuesta = moto.preguntarNecesidad(PFrenos);
                mantener_o_novedad = moto.verificarRespuesta();
                break; 

            case 4:
                respuesta = moto.preguntarNecesidad(PFiltro);
                mantener_o_novedad = moto.verificarRespuesta();
                break;

            case 5:
                respuesta = moto.preguntarNecesidad(cadena);
                mantener_o_novedad = moto.verificarRespuesta();
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Eligió una opción incorrecta. Intente de nuevo.");
                break;
        }

        return mantener_o_novedad;
    }

    public void darSalidad() {
        JOptionPane.showMessageDialog(null, "Motocicleta lista para darle salida");
    }

    public boolean preguntarArreglos () {
        respuesta_Arreglos = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Hubo algun arreglo adicional hecho por parte del mecánico?\n" + 
        "(Escribir 'true' o 'false', según el caso)"));
        return respuesta_Arreglos;
    }

    public String describirArreglo () {
        arreglo = JOptionPane.showInputDialog("Describa especificamente que arreglos necesitó");
        return arreglo;
    }

    public String describirRepuestos () {
        Punto6 moto = new Punto6();
        arreglo = JOptionPane.showInputDialog("Mencione los respuestos utilizados para el arreglo");
        moto.darSalidad();
        return repuestos;
    }


    public void mostrarMantenimiento (String nombre, String marca, String modelo, int cilindraje2, String placa, String observaciones, String mantenimientoNovedad, String arreglo, String repuestos) {
        JOptionPane.showMessageDialog(null, "Al propietario " + nombre +" de la moto de marca "+ marca +" modelo "+ modelo +" con cilindraje de "+ cilindraje2 +"cc y placa "+ placa +".\n" 
        + "Se le informa, que de acuerdo a las observaciones dadas: " + observaciones
        + "\nSe realizó el siguiente trabajo:"
        + "\n1. Mantenimiento o Novedad: " + mantenimientoNovedad
        + "\n2.Arreglo: " + arreglo
        + "\n3.Repuestos: " + repuestos
        + "\nLISTO! Estamos a su servicio.");
    }

    public void descartarMoto () {
        JOptionPane.showMessageDialog(null, "Esta moto no puede ingresar al taller EL MAQUINISTA porque no es de alto cilindraje");
    }

    public void mostrarSalida (String nombre, String marca, String modelo, int cilindraje2, String placa, String arreglo, String repuestos) {
        JOptionPane.showMessageDialog(null, "Al propietario " + nombre +" de la moto de marca "+ marca +" modelo "+ modelo +" con cilindraje de "+ cilindraje2 +" y placa "+ placa +".\n" 
        + "Se realizó el siguiente trabajo:"
        + "\n1. Arreglos: " + arreglo
        + "\n2. Repuestos: " + repuestos
        + "\nLISTO! Estamos a su servicio.");
    }
}
