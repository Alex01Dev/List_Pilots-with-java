public class NodoP {
    public String name,model;
    public int point;
    public NodoP siguiente;

    public NodoP(String n,String m,int p, NodoP s){
        name = n;
        model = m;
        point = p;  

        siguiente = s;
    }
    public NodoP(String n,String m,int p){
        this.name = n;
        this.model = m;
        this.point = p;
        this.siguiente = null;

    }
}
