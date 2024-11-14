import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Primera clase perro
        Perro perro = new Perro();

        //Segunda clase gato
        Gato gato = new Gato("Kirara",7);

        //Tercera clase hamster
        Hamster hamster = new Hamster(1.2,"Marrón claro");

        //Cuarta clase tortuga
        Tortuga tortuga = new Tortuga("Barry",5,16.7,"Gálapagos");

        //Quinta clase pajaro
        Pajaro pajaro = new Pajaro();
        System.out.println("Ingresar datos para el pájaro: ");
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el color de plumas: ");
        String colorP = sc.nextLine();
        System.out.println("Ingrese el tamaño de pico: ");
        int tpico = sc.nextInt();

        pajaro.setNombre(nombre);
        pajaro.setEdad(edad);
        pajaro.setColorPlumas(colorP);
        pajaro.setTamanoPico(tpico);

    }
}