import java.util.*;

public class Ejercicio10 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int multiplosde6 = 0;
		int suma = 0;
		int suma1al10 = 0;

		int numeroasumar;

		do {
			System.out.println("Ingrese el numero a sumar a "+suma);
			numeroasumar = scanner.nextInt();
			suma = suma+numeroasumar;
			if (numeroasumar%6==0) {
				multiplosde6 = multiplosde6+1;
			}
			if (numeroasumar>=1 && numeroasumar<=10) {
				suma1al10 = suma1al10+numeroasumar;
			}
		} while (suma<=1000);
		System.out.println("El numero total de multimplos de 6 es "+multiplosde6);
		System.out.println("El las suma de numeros que se encuentran entre 1 y 10 es "+suma1al10);
	}

}

