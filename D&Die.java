import java.util.Random;
import java.util.Scanner;
public class d20 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("What dice you want to roll? ");
		int Die = sc1.nextInt();
		System.out.println("Attribute modifier:  ");
		int Modifier = sc1.nextInt();
		int Valor = aleatorio.nextInt(Die)+ 1;
		if(Valor == 20 && Die == 20) {
			System.out.println(Valor + " Critical roll!!!!!");
		}
		if(Valor == 1 && Die == 20) {
			System.out.println(Valor + " Critical fail...");
		}
		if(Valor > 1 && Valor < 20  || Valor > 20) {
			System.out.println(Valor + Modifier);
		}

	}

}
