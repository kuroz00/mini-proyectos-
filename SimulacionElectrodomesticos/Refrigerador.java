import java.util.ArrayList; 
public class Refrigerador extends Electrodomestico{
    //Atributos
    private static int capacidadItems = 20;
    private static ArrayList<Comida> refrigeradorItems = new ArrayList<>(); //Guardar items aqui, establecer el maximo y ademas una var de temperatura interna.
    private static int cantidadItems = refrigeradorItems.size();
    //Metodos 
    //Instancia del singleton
    private InterruptorGeneral obj;
    /**
     * Constructor de la clase Refrigerador.
     * Inicializa el consumo electrico y el nombre del refrigerador.
     */
    public Refrigerador() {
        super();  
        this.consumoElectrico = 500;
        this.nombre = "refrigerador";
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    private static Refrigerador refri = new Refrigerador();
    /**
     * Obtiene la instancia del singleton Refrigerador.
     * 
     * @return La instancia del refrigerador.
     */
    public Refrigerador getRefri(){
        return refri;
    }

    
     //Metodos propios de la clase
     //Get Set
    public int getCapacidadItems(){
        return capacidadItems;    
    }

    /**
     * Guarda un item de comida en el refrigerador si hay espacio disponible.
     * 
     * @param comida El item de comida a ser guardado en el refrigerador.
     */
    public  void guardar (Comida comida){
        if(cantidadItems < capacidadItems){
            refrigeradorItems.add(comida);
            cantidadItems = refrigeradorItems.size();
        } else {
            System.out.println("Refrigerador lleno!"); //mensaje saltara por pantalla cuando se llene el refrigerador
        }
    }
    /**
     * Saca un item de comida del refrigerador si hay items presentes.
     * 
     * @param comida El item de comida a ser sacado del refrigerador.
     */
    public void sacar(Comida comida){
        if(this.cantidadItems > 0){
            this.refrigeradorItems.remove(comida);
            cantidadItems = refrigeradorItems.size();
        } else {
            System.out.println("No hay NADA.");
        }
    }
}
