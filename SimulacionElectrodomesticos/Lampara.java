public class Lampara extends Electrodomestico { 
    //Instancia y atributos
    private String color = "rojo";
    
    //Instancia del singleton
    private InterruptorGeneral obj;
    /**
     * Constructor de la clase Lampara.
     * Inicializa el consumo electrico y el nombre de la lampara.
     * 
     * @param consumoElectrico El consumo electrico de la lampara en vatios.
     */
    public Lampara(int consumoElectrico) {
        super(); //ESTUDIAR FUNCIONAMIENTO Y LOGICA. <-- 
        this.consumoElectrico = consumoElectrico;
        this.nombre = "lampara";
        
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();//
    }
    
    /**
     * Cambia el color de la lampara entre rojo y verde.
     * 
     * @return El nuevo color de la lampara.
     */
    public String cambiarColor(){
        if (color == "rojo"){
            color = "verde";
        } else {
            color = "rojo";
        }
        return  color;
    }
}