import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Primera clase perro
        Perro perro = new Perro();
        perro.mostrarPerro();
        perro.perseguirPelota();

        System.out.println();

        //Segunda clase gato
        Gato gato = new Gato("Kirara",7);
        gato.mostrarGato();
        gato.cazarRaton();

        System.out.println();

        //Tercera clase hamster
        Hamster hamster = new Hamster(1.2,"Marrón claro");
        hamster.mostrarHamster();
        hamster.comerSemilla();

        System.out.println();

        //Cuarta clase tortuga
        Tortuga tortuga = new Tortuga("Barry",5,16.7,"Gálapagos");
        tortuga.mostrarTortuga();
        tortuga.esconderse();

        System.out.println();

        //Quinta clase pajaro
        Pajaro pajaro = new Pajaro();
        System.out.println("Ingresar datos para el pájaro: ");
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el color de plumas: ");
        String colorP = sc.nextLine();
        System.out.println("Ingrese el tamaño de pico: ");
        double tpico = sc.nextDouble();

        pajaro.setNombre(nombre);
        pajaro.setEdad(edad);
        pajaro.setColorPlumas(colorP);
        pajaro.setTamanoPico(tpico);

        //Pajaro
        System.out.println();
        pajaro.mostrarPajaro();
        pajaro.volar();

        System.out.println();

        System.out.println("Nombre :"+pajaro.getNombre());
        System.out.println("Edad :"+pajaro.getEdad());
        System.out.println("Color de plumas :"+pajaro.getColorPlumas());
        System.out.println("Tamano Pico :"+pajaro.getTamanoPico());

    }
}