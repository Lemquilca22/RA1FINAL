import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        //Simulador de dados
        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        System.out.println("Bienvenido al smiluador de dados");
        System.out.println("Puedes usar 1 a 6 dados para jugar");
        System.out.println("Con cuantos quieres jugar?");
        int dados = sc.nextInt();
        int resultado1;
        int resultado2;
        int resultado3;
        int resultado4;
        int resultado5;
        int resultado6;
        int total;

        switch (dados) {
            case 1:
                resultado1 = generador.nextInt(6) + 1;
                total = resultado1;
                System.out.println("Al tirar un solo dado obtuviste: "+total);
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
        }
    }
}
