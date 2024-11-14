public class Gato extends Mascota{
    String tipoPelaje;
    String colorOjos;

    //Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    //Metodo personalizado

    public void mostrarGato(){
        System.out.println("tipo de pelaje: "+tipoPelaje);
        System.out.println("Color de Ojos: "+colorOjos);
    }

    public void cazarRaton(){
        System.out.println("El gato fue por el ratón");
    }
}
