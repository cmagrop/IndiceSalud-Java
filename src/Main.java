import java.util.Scanner;

public class Main {
    //atributo clase
    static Scanner leer = new Scanner(System.in);

    //métodos de la clase

    public static void main(String[] args) {
        /*Persona persona1 = new Persona();
        persona1.rut="12.345.678-9";
        persona1.nombre="JUANITO PÉREZ";
        persona1.edad=40;
        persona1.altura=1.85;
        persona1.peso=80;

        persona1.Verificar();

        persona1.Imprimir();*/

        //ingresoDatos();
        Persona persona2 = new Persona("12.345.567-8","Juliana",34,1.68,76);
        persona2.Verificar();
        persona2.Imprimir();
    }

    public static void ingresoDatos()
    {

        //variables local
        Persona cualquierPersona = new Persona();
        System.out.println("Ingrese su RUT");
        cualquierPersona.rut=leer.nextLine();
        System.out.println("Ingrese su nombre");
        cualquierPersona.nombre=leer.nextLine();
        System.out.println("Ingrese su edad");
        cualquierPersona.edad= leer.nextInt();
        System.out.println("Ingrese altura");
        cualquierPersona.altura = leer.nextDouble();
        System.out.println("Ingrese peso");
        cualquierPersona.peso= leer.nextDouble();
        //mostrar información ingresada
        System.out.println("Información ingresada");
        cualquierPersona.Verificar();
        cualquierPersona.Imprimir();




    }





}