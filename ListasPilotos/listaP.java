public class listaP {
    protected NodoP inicio, fin;

    public listaP(){
        inicio = null;
        fin = null;
    }

    public boolean vacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    //Insertar Nodo al comienzo
    public void insertarPrincipio(String name,String model, int p){
        inicio = new NodoP(name,model,p, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    //Metodo para agregar al final
     public boolean listaVacia(){
            if(inicio == null){
                return true;
            }else{
                return false;
            }
        }
    //eliminar al primer piloto
    public String eliminarPilotoIni() {
        if (!vacia()) {
            String name = inicio.name;
            String model = inicio.model;
            int point = inicio.point;
            
            if (inicio == fin) { 
                inicio = null;
                fin = null; 
            } else {
                inicio = inicio.siguiente;
            }
            return name;
        } else {
            return "piloto"; 
        }
    }
    //Ganador de Puntos
    public void ganadorPuntos(String name,String model, int p){
        NodoP piloto = inicio;
        double sumaT = 0;
        double sumaa = 0;
        while(piloto != null){
            sumaT = sumaT + piloto.point;
            piloto = piloto.siguiente;
            sumaa++;
        }
        double result = sumaT+sumaa;
        System.out.println("El Piloto: " + name + " con el vehiculo: " + model + " Fue el Ganador de mas puntos con: " + p);
    }

     //Agregar al Final
public void agregarFinal(String name, String model, int p){
    if(!listaVacia()){
        fin.siguiente = new NodoP(name,model,p);
        fin = fin.siguiente;
    }else{
        inicio = fin = new NodoP(name,model,p);
    }
}

//Eliminar Piloto Puntero
public void eliminarGanadorPuntos(String name, String model, int p){
        NodoP piloto = inicio;
        double sumaT = 0;
        double sumaa = 0;
        while(piloto != null){
            sumaT = sumaT + piloto.point;
            piloto = piloto.siguiente;
            sumaa++;
        }
        double result = sumaT+sumaa;
        
        System.out.println("El Piloto: " + name + " Puntero con: " + p + " Puntos");
        System.out.println("Sera Eliminado y se restara un punto al piloto de la DERECHA");

        NodoP anterior = null;
        piloto = inicio;
    while (piloto != null) {
        if (piloto.point == p) {
            if (anterior != null) {
                anterior.siguiente = piloto.siguiente;
            } else {
                inicio = piloto.siguiente;
            }
            break;
        }
        anterior = piloto;
        piloto = piloto.siguiente;
    }


    if (piloto != null) {
        piloto.point--;
    }

        mostrarLista();
    }

    //Buscar Piloto
    public int buscarPiloto(String name){
        NodoP piloto = inicio;
        boolean encontrado = false;
        
        while (piloto != null) {
            if(piloto.name == (name)){
                System.out.println("Piloto: " + name + " Esta en la carrera");
                encontrado = true;
                break;
            }
            piloto = piloto.siguiente;
        }
        
        if(!encontrado){
            System.out.println("Piloto " + name + " NO esta en la Carrera");
        }
        
        return 1;
    }
    
    //Mostrar Lista
    public void mostrarLista() {
        NodoP piloto = inicio;
        while (piloto != null) {
            System.out.print("[|-" + piloto.name+ "|-|" + piloto.model + "|-|" + piloto.point + "-|]===>");
            piloto = piloto.siguiente;
        }
    }



}
