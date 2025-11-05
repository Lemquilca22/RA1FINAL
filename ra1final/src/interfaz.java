import java.util.Random;
import java.util.Scanner;

public class interfaz {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        String rpta;
        do {
            System.out.println("Este es la interfaz de herramientas multiples de DAM");
            System.out.println("Cual quieres usar ahora?");
            System.out.println("Estas son las opciones: ");
            System.out.println("1) Calculadora\n2) Conversor de temperatura\n3) Clasificador de numeros\n4) Calculador de edad\n5)\n6) Simulador de dados" +
                    "\n7) Generador de números aleatorios\n8) Contador de palabras y caracteres");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:

                    break;

                case 6:
                    Random generador = new Random(); //Importe la libreria de random porque permite generar
                    //numeros aleatorios y eso es lo que un dado hace.
                    System.out.println("Bienvenido al smiluador de dados");
                    System.out.println("Puedes usar 1 a 6 dados para jugar");
                    System.out.println("Con cuantos dados quieres jugar?");
                    int dados = sc.nextInt();
                    int resultado1, resultado2, resultado3, resultado4, resultado5, resultado6;
                    int total;

                    switch (dados) {
                        case 1:
                            resultado1 = generador.nextInt(6) + 1;
                            total = resultado1;
                            System.out.println("Al tirar un solo dado obtuviste: "+total);
                            break;
                        case 2:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;
                        case 3:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            resultado3 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2+resultado3;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("El resultado del dado 3 es: "+resultado3);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;
                        case 4:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            resultado3 = generador.nextInt(6) + 1;
                            resultado4 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2+resultado3+resultado4;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("El resultado del dado 3 es: "+resultado2);
                            System.out.println("El resultado del dado 4 es: "+resultado2);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;

                        case 5:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            resultado3 = generador.nextInt(6) + 1;
                            resultado4 = generador.nextInt(6) + 1;
                            resultado5 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2+resultado3+resultado4+resultado5;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("El resultado del dado 3 es: "+resultado3);
                            System.out.println("El resultado del dado 4 es: "+resultado4);
                            System.out.println("El resultado del dado 5 es: "+resultado5);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;
                        case 6:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            resultado3 = generador.nextInt(6) + 1;
                            resultado4 = generador.nextInt(6) + 1;
                            resultado5 = generador.nextInt(6) + 1;
                            resultado6 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2+resultado3+resultado4+resultado5+resultado6;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("El resultado del dado 3 es: "+resultado3);
                            System.out.println("El resultado del dado 4 es: "+resultado4);
                            System.out.println("El resultado del dado 5 es: "+resultado5);
                            System.out.println("El resultado del dado 6 es: "+resultado6);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;
                    }
                    System.out.println("Gracias por jugar!!");
                    break;

                case 7:
                    Random generador2 = new Random();
                    System.out.println("Bienvenido al generador de Números aleatorios");
                    System.out.println("Para poder jugar, debes escoger un rango, \na continuación ingresa el valor minimo y maximo que puede tomar el número ");
                    System.out.println("Ingresa el valor mínimo del numero:");
                    int min = sc.nextInt();
                    System.out.println("Ingresa el valor máximo del numero:");
                    int max = sc.nextInt();

                    int resultado = generador2.nextInt(max-min+1) + min;
                    //la razon por la cual sumo "min" a esta parte del codigo es, para que
                    //me genere numeros a partir del valor minimo; de otro modo, por ejemplo
                    //si mi numero min fuera 25 y el maximo 75, (sin la suma del min), los valores
                    //aleatorios serian del 0-50 y no del 25-75.
                    System.out.println("Su número es: "+resultado);
                    break;

                case 8:
                    break;

                case 9:
                    System.out.println("Nos vemos pronto!");
                    break;

            }
            System.out.println("Deseas usar otra herramienta? (si/no)");
            rpta =sc.next();
            if (rpta.equals("no")) {
                salir = false;
            }
        } while (salir);

    }
}
