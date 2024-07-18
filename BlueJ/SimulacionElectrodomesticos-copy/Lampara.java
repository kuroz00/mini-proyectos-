public class Lampara extends Electrodomestico { 
    //Instancia y atributos
    private String color = "rojo";
    
    //Instancia del singleton
    private InterruptorGeneral obj;
    public Lampara(int consumoElectrico) {
        super(); //ESTUDIAR FUNCIONAMIENTO Y LOGICA. <-- 
        this.consumoElectrico = consumoElectrico;
        this.nombre = "lampara";
        
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();//
    }
    
    public String cambiarColor(){
        if (color == "rojo"){
            color = "verde";
        } else {
            color = "rojo";
        }
        return  color;
    }
}