public class Hamster extends Mascota{
    double longitudDientes;
    String colorPiel;

    //Constructor
    public Hamster(double longitudDientes, String colorPiel){
        this.longitudDientes = longitudDientes;
        this.colorPiel = colorPiel;
    }

    //metodo personalizado
    public void mostrarHamster(){
        System.out.println("Hamster");
        System.out.println("Longitud dientes: " + longitudDientes);
        System.out.println("Color piel: " + colorPiel);
    }

    public void comerSemilla(){
        System.out.println("Esta comiendo la semilla......");
    }

}
