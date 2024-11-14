public class Perro extends Mascota{
    String color;
    double peso;

    //constructor


    public Perro() {
    }

    //metodos personalizados
    public void mostrarPerro() {
        System.out.println("Perro: " + color + "\nPeso: " + peso);
    }

    public void perseguirPelota(){
        System.out.println("El perro esta persiguiendo la pelota");
    }
}
