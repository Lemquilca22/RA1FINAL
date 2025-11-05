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
            System.out.println("1) Calculadora\n2) Conversor de temperatura\n3) Clasificador de numeros\n4) Calculador de edad\n5)\n6)Simulador de dados" +
                    "\n7) Generador de números aleatorios\n8) Contador de palabras y caracteres\n9)Salir");
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
                    break;

                case 7:
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
