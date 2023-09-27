import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        int i = 0;
        double ultimoNumero = 0;
        double numeroMayor=0;
        double numeroMenor=0;

        System.out.println("Escribe todos los números que quieras y cuando quieras terminar, pon un 0. Los números que introduzcas se almacenarán cada vez que le des al intro");
        double numero = sc.nextDouble();

        while (numero != 0) {

            numeros.add(numero);
            i++;
            numero = sc.nextDouble();
        }
        for (int j = 1; j < numeros.size(); j++) {
            if (numeroMayor < numeros.get(j)) {
                numeroMayor = numeros.get(j);
            }
            if (numeroMenor > numeros.get(j)) {
                numeroMenor = numeros.get(j);
            }
        }

        Collections.sort(numeros);
        numeroMenor=numeros.get(0);
        numeroMayor=numeros.size()-1;

        System.out.println("El mayor número es: " + numeroMayor);
        System.out.println("El menor número es: " + numeroMenor);
    }
        }
