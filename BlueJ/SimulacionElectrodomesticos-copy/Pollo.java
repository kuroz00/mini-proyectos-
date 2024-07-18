
public class Pollo extends Comida{
    //atributos 
    String coccion = "crudo";
    String estado = "entero";
    
    
    //instancia y singleton; 
    public Pollo(){
        super();
        this.nombre = "pollo"; 
        this.peso = "1Kg";
        this.precio = 6000.2f;
    }
    
    
    //metodos
    public String cocinar(){
        return coccion = "cocido";
    }
}
