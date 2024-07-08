public class Manzana extends Comida{
    //atributos
    private String estado = "intacta";
    public Manzana(){
        super();
        this.nombre = "manzana";
        this.color = "rojo";
        this.peso = "200 Grs";
        this.precio = 300.0f;
    }
    //metodos
    public String morder(){
        switch (estado){
            case "intacta":
                estado = "mordida";
                peso = "150Grs";
                break;
            case "mordida":
                estado = "mascadisima";
                peso = "100Grs";
                break;
            case "mascadisima":
                estado = "Le queda el palito noma'";
                peso = "50Grs";
                break;
            case "Le queda el palito noma'":
                estado = "pepita";
                peso = "1Grs";
                break;
        }
        return estado;
    }
}
