public class Pajaro extends Mascota{

    String colorPlumas;
    double tamanoPico;

    //Constructores

    public Pajaro() {}

    public Pajaro(String nombre, int edad, String colorPlumas, double tamanoPico) {
        super(nombre, edad);
        this.colorPlumas = colorPlumas;
        this.tamanoPico = tamanoPico;
    }

    //setter y getters

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public double getTamanoPico() {
        return tamanoPico;
    }

    public void setTamanoPico(double tamanoPico) {
        this.tamanoPico = tamanoPico;
    }
}
