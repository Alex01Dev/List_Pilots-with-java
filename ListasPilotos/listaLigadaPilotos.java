import javax.swing.JOptionPane;

public class listaLigadaPilotos {
    public static void main(String[] args){
        listaP ls = new listaP();
        int op = 3;
        int p = 0;
        String name="";
        String model = "";
    
    do{

        op = Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Agregar piloto al Inicio\n2.-Agregar Despues\n3.-Mostrar Listas\n4.-Ganador de Puntos\n5.-Eliminar Piloto Inicial\n6.-Buscar Piloto\n7.-Eliminar Piloto Puntero"));

        switch (op) {
            case 1: 
            name = String.format(JOptionPane.showInputDialog(null,"Ingresa el Nombre del Piloto", "Amauri"));
            model = String.format(JOptionPane.showInputDialog(null,"Ingresa el Modelo del Vehiculo","Pointer-vold-123"));
            p = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa los Puntos Obtenidos",2));
            ls.insertarPrincipio(name,model,p);
            break;

            case 2:
             name = String.format(JOptionPane.showInputDialog(null,"Ingresa el Nombre del Piloto", "Amauri"));
            model = String.format(JOptionPane.showInputDialog(null,"Ingresa el Modelo del Vehiculo","Pointer-vold-123"));
            p = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa los Puntos Obtenidos",2));
            ls.agregarFinal(name, model, p);
            break;

            case 3: ls.mostrarLista();
            break;
        
            case 4:ls.ganadorPuntos(name,model,p);
            break;

            case 5: ls.eliminarPilotoIni();
            break;

            case 6: String.format(JOptionPane.showInputDialog(null,"Buscar Piloto, Ingresa su Nombre: ", "Juan"));
            ls.buscarPiloto(name);
            break;

            case 7:ls.eliminarGanadorPuntos(name, model, p);
            break;

            default:
            break;
        }


    }while(op != 3);
    }
    
}
