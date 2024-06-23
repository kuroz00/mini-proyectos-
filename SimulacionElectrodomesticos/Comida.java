
public abstract class Comida{
    //atributos
    protected String nombre;
    protected String peso;
    protected String color;
    protected Float precio;
    protected boolean almacenado = false;
    
    
    //metodos
    private Refrigerador objRefri;
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
    
    
    //metodos del arreglo del refri.
    public void guardarEnRefri(){
        if(almacenado != true){
            objRefri.guardar(this);
            almacenado = true;
        }
    }
    public void quitarDelRefri(){
        if(almacenado == true){
            objRefri.sacar(this);
            almacenado = false;
        }
    }
}
