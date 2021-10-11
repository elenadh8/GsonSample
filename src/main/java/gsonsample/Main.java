package gsonsample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Personas person=new Personas();

        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce tu apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();

        person.setNombre(nombre);
        person.setApellidos(apellido);
        person.setEdad(edad);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);

        System.out.println(json);
        scanner.close();

    }

}