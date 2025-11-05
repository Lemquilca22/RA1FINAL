import java.util.Scanner;

public class interfaz {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String rpta;
        do {
            System.out.println("Este es la interfaz de herramientas multiples de DAM");
            System.out.println("Cual quieres usar ahora?");
            System.out.println("Estas son las opciones: ");
            System.out.println("1) Calculadora\n2) Conversor de temperatura\n3) Clasificador de numeros\n4) Calculador de edad\n5)\n6)Simulador de dados" +
                    "\n7) Generador de números aleatorios\n8) Contador de palabras y caracteres");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

            }

        } while (salir);

    }
}
