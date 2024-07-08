
public class Pollo extends Comida{
    //atributos 
    String coccion = "crudo";
    String estado = "entero";
    
    
    /**
     * Constructor de la clase Pollo.
     * Inicializa las propiedades heredadas de la clase Comida y establece las propiedades específicas del pollo.
     */
    public Pollo(){
        super();
        this.nombre = "pollo"; 
        this.peso = "1Kg";
        this.precio = 6000.2f;
    }
    
    

    /**
     * Cocina el pollo cambiando su estado de cocción de crudo a cocido.
     *
     * @return El estado de cocción actual del pollo después de ser cocinado (cocido).
     */
    public String cocinar(){
        return coccion = "cocido";
    }
}
