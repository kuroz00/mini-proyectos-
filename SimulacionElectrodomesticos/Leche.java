public class Leche extends Comida{
    //atributos
    private String marca = "Lider";
    private String cantidadRestante = "Llena";
    
    public Leche(){
        super();
        this.nombre = "leche";
        this.color = "blanco";
        this.peso = "1 Lt";
        this.precio = 1990.0f;
    }
    //
    public String beber(){
        switch(cantidadRestante){
            case "Llena":
                cantidadRestante = "Casi llena";
                peso = "900 Ml";
                break;
            case "Casi llena":
                cantidadRestante = "Casi la mitad";
                peso = "700 Ml";
                break;
            case "Casi la mitad":
                cantidadRestante = "La mitad";
                peso = "500 Ml";
                break;
            case "La mitad":
                cantidadRestante = "menos de la mitad";
                peso = "400 Ml";
                break;
            case "menos de la mitad":
                cantidadRestante = "Se esta acabando!";
                peso = "300 Ml";
                break;
            case "Se esta acabando!":
                cantidadRestante = "Casi se acaba...";
                peso = "200 Ml";
                break;
            case "Casi se acaba...":
                cantidadRestante = "Un sorbo";
                peso = "100 Ml";
                break;
            case "Un sorbo":
                cantidadRestante = "Vacia...";
                peso = "0 Ml";
                break;
        }
        return peso;
    }
}
