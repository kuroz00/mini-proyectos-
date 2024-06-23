import java.util.ArrayList; 
public class Refrigerador extends Electrodomestico{
    //Atributos
    private static int capacidadItems = 20;
    private static ArrayList<Comida> refrigeradorItems = new ArrayList<>(); //Guardar items aqui, establecer el maximo y ademas una var de temperatura interna.
    private static int cantidadItems = refrigeradorItems.size();
    //Metodos 
    //Instancia del singleton
    private InterruptorGeneral obj;
    public Refrigerador() {
        super();  
        this.consumoElectrico = 500;
        this.nombre = "refrigerador";
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    private static Refrigerador refri = new Refrigerador();
    public Refrigerador getRefri(){
        return refri;
    }
    
    /*
    //GET --> ACCEDER al valor de un atributo
    public boolean getEstadoElectrodomestico() {
        return estadoElectrodomestico;
    }
    public boolean getConexion(){
        return conexion;
    }
    public int getConsumoElectrico(){
        return consumoElectrico;
    }
    //SET --> MODIFICAR el valor de un atributo
    public boolean setEstadoElectrodomestico() {
        return estadoElectrodomestico;
    }
    public boolean setConexion(){
        return conexion;
    }
    public int setConsumoElectrico(){
        return consumoElectrico;
    }
    */
    
     //Metodos propios de la clase
     //Get Set
    public int getCapacidadItems(){
        return capacidadItems;    
    }

     //Metodos Arreglo
    public  void guardar (Comida comida){
        if(cantidadItems < capacidadItems){
            refrigeradorItems.add(comida);
            cantidadItems = refrigeradorItems.size();
        } else {
            System.out.println("Refrigerador lleno!"); //mensaje saltara por pantalla cuando se llene el refrigerador
        }
    }
    public void sacar(Comida comida){
        if(this.cantidadItems > 0){
            this.refrigeradorItems.remove(comida);
            cantidadItems = refrigeradorItems.size();
        } else {
            System.out.println("No hay NADA.");
        }
    }
}
