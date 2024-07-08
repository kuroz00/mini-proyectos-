
public class Pan extends Comida{
    private boolean tostado = false; //(false para no, true para si);
    private String estado = "completo";
    
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
