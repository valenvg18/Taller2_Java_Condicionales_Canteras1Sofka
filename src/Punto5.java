import javax.swing.JOptionPane;

public class Punto5 {

    String cabeza = "el dolor de cabeza";
    String gripa = "la gripa";
    String malestar = "el malestar general";
    String higiene = "la higiene personal";

    String razonDevolucion;
    

    String [] medicamentos = {"Advil", "Dolex", "Pax", "Acetaminofen", "Noxpirin", "Ibuprofeno", "Desodorante", "Shampoo"};

    int [] precios = {13000, 16000, 3000, 10000, 14000, 6000, 11000, 20000}; 

    public int preguntarAccion () {
        int solicitud = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la soliciud que desea realizar?\n" +
        "1. Comprar un medicamento o producto\n" + 
	    "2. Devolución de un producto")); 
        return solicitud;
    }

    
    

    public void escogerMedicamento (String tipoMedicamento, String m1, String m2, int precio1, int precio2) {
        int medicamento = Integer.parseInt(JOptionPane.showInputDialog("Los productos disponibles para " + tipoMedicamento + " son:\n" + 
        "1. " + m1 + "\n" + 
        "2. " + m2 + "\n")); 

        

        switch (medicamento) {
            case 1:
                String opcion = JOptionPane.showInputDialog("El precio del " + m1 + " es: $" + precio1 + "\n" + 
                "¿Deseas comprarlo?");
                if (opcion.equals("si") || opcion.equals("Si") || opcion.equals("SI")) {
                    JOptionPane.showMessageDialog(null, "¡HECHO! Producto comprado");
                } else {
                    JOptionPane.showMessageDialog(null, "Puedes mirar otros productos");
                }
                break;

            case 2:
                opcion = JOptionPane.showInputDialog("El precio del " + m2 + " es: $" + precio2 + "\n" + 
                "¿Deseas comprarlo?");
                if (opcion == "si" || opcion == "Si" || opcion == "SI") {
                    JOptionPane.showMessageDialog(null, "¡HECHO! Producto comprado");
                } else {
                    JOptionPane.showMessageDialog(null, "Puedes mirar otros productos");
                }   
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "No tenemos ese medicamento para "+ tipoMedicamento + " en stock");
                break;
        }
        
    }

    

    

    public void elegirProductos () {

        Punto5 punto5 = new Punto5();

        int categoriaproducto = Integer.parseInt(JOptionPane.showInputDialog("¿Que categoría de productos quisieras ver?\n" +
        "1. Medicamentos para " + cabeza + "\n" +
        "2. Medicamentos para " + gripa + "\n" + 
        "3. Medicamentos para " + malestar + "\n" +
        "4. Productos para " + higiene));

        switch (categoriaproducto) {
            case 1:
                punto5.escogerMedicamento(cabeza, medicamentos[0], medicamentos[1], precios[0], precios[1]);
                break;

            case 2:
                punto5.escogerMedicamento(gripa, medicamentos[2], medicamentos[3], precios[2], precios[3]);
                break;

            case 3:
                punto5.escogerMedicamento(malestar, medicamentos[4], medicamentos[5], precios[4], precios[5]);
                break;

            case 4:
                punto5.escogerMedicamento(higiene, medicamentos[6], medicamentos[7], precios[6], precios[7]);
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "¡OPCIÓN INCORRECTA!\n" + "Por favor marque una opción que esté designada");
                break;
        }
        
    }

    public void mostrarDevolucion (String medicamento) {
        JOptionPane.showMessageDialog(null, medicamento + " en proceso de devolución porque: \n" + razonDevolucion + "\nEn unos instantes le daremos información sobre su solicitud. GRACIAS");
    }

    

    public void devolverProducto () {

        Punto5 devolver = new Punto5();

        int devolucion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el producto o medicamento que desea devolver?\n" + 
        "1. " + medicamentos[0] + "\n" +
		"2. " + medicamentos[1] + "\n" +
		"3. " + medicamentos[2] + "\n" +
		"4. " + medicamentos[3] + "\n" +
		"5. " + medicamentos[4] + "\n" +
		"6. " + medicamentos[5] + "\n" +
		"7. " + medicamentos[6] + "\n" +
		"8. " + medicamentos[7] ));

        razonDevolucion = JOptionPane.showInputDialog("¿Por qué desea realizar la devolución?");

        switch (devolucion) {
            case 1:
                devolver.mostrarDevolucion(medicamentos[0]);
                break;

            case 2:
                devolver.mostrarDevolucion(medicamentos[1]);
                break;

            case 3:
                devolver.mostrarDevolucion(medicamentos[2]);
                break;

            case 4:
                devolver.mostrarDevolucion(medicamentos[3]);
                break;

            case 5:
                devolver.mostrarDevolucion(medicamentos[4]);
                break;

            case 6:
                devolver.mostrarDevolucion(medicamentos[5]);
                break;

            case 7: 
                devolver.mostrarDevolucion(medicamentos[6]);
                break;

            case 8: 
                devolver.mostrarDevolucion(medicamentos[7]);
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Ingreso un medicamento que NO se encuentra en la lista");
                break;
        } 

    }
}

