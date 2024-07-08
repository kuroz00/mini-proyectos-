
public class Pan extends Comida{
    private boolean tostado = false; //(false para no, true para si);
    private String estado = "completo";
     /**
     * Constructor de la clase Pan.
     * Inicializa las propiedades heredadas de la clase Comida y establece las propiedades específicas del pan.
     */
    public Pan(){
    super();
    this.nombre = "pan";
    this.peso = "1kg";
    this.precio = 2000.2f;
    }
   
    
    public boolean getTostado(){
    return this.tostado;
    }
    public void setTostado(boolean tostado){
    this.tostado = tostado;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    /**
     * Metodo para simular morder el pan, cambiando su estado.
     * Dependiendo del estado actual del pan, cambia su estado interno al ser mordido.
     *
     * @return El estado actual del pan después de ser mordido.
     */
    public String morder (){
        switch (estado){
            case "completo":
                this.estado = "mordido";
                break;
            case "mordido":
                this.estado = "a medio comer";
                break;
            case "a medio comer":
                this.estado = "casi se acaba...";
                break;
            case "casi se acaba...":
                this.estado = "comido.";
                break;
            default:
                break;
        }
        return estado;
    }
}
