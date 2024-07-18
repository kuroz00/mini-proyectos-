/**
 * Clase abstracta Comida que define las propiedades basicas de una comida.
 */
public abstract class Comida{
    //atributos
    protected String nombre;
    protected String peso;
    protected String color;
    protected Float precio;
    protected boolean almacenado = false;
    
    
    /**
     * Instancia del singleton Refrigerador.
     */
    private Refrigerador objRefri;
    /**
     * Constructor de la clase Comida.
     * Inicializa la referencia al refrigerador.
     */
    public Comida() {       
        Refrigerador x = new Refrigerador();
        objRefri = x.getRefri();
    }
    
    
    //GetSet
    public String getNombre(){
        return nombre;
    }
    public String getPeso(){
        return peso;
    }
    public String getColor(){
        return color;
    }
    public Float getPrecio(){
        return precio;
    }
    public String setNombre(String nombre){
        return this.nombre = nombre;
    }
    public String setPeso(String peso){
        return this.peso = peso;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public Float setPrecio(Float precio){
        return this.precio = precio;
    }
    
    
    /**
     * Guarda el item de comida en el refrigerador si no esta almacenado.
     */
    public void guardarEnRefri(){
        if(almacenado != true){
            objRefri.guardar(this);
            almacenado = true;
        }
    }
    /**
     * Quita el item de comida del refrigerador si esta almacenado.
     */
    public void quitarDelRefri(){
        if(almacenado == true){
            objRefri.sacar(this);
            almacenado = false;
        }
    }
}
