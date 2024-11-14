public class Tortuga extends Mascota {
    double tamanoCaparazon;
    String lugarNacimiento;

    //Constructor

    public Tortuga(String nombre, int edad, double tamanoCaparazon, String lugarNacimiento) {
        super(nombre, edad);
        this.tamanoCaparazon = tamanoCaparazon;
        this.lugarNacimiento = lugarNacimiento;
    }

    //Metodo personalizado
    public void mostrarTortuga(){
        System.out.println("Tortuga");
        System.out.println("Tamaño de caparazón: "+tamanoCaparazon);
        System.out.println("Lugar de Nacimiento: "+lugarNacimiento);
    }

    public void esconderse(){
        System.out.println("La tortuga se escondio dentro de su caparazón");
    }

}
