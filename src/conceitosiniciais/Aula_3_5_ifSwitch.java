package conceitosiniciais;

public class Aula_3_5_ifSwitch {

	public static void main(String[] args) {

//		int num = 10;
//		
//		if (num > 10) {
//			System.out.println("O n�mero � maior que 10");
//		} else if (num < 10) {
//			System.out.println("O n�mero � menor que 10");
//		} else {
//			System.out.println("O n�mero � 10");
//			System.out.println("O n�mero � 10 mesmo!");
//		}
		
		int num = 10;
		
		switch (num) {
		case 5:
			System.out.println("O n�mero � 5");
			break;
		case 10:
			System.out.println("O n�mero � 10");
			break;
		case 15:
			System.out.println("O n�mero � 15");
			break;
		default:
			System.out.println("O n�mero � outro");
			break;
		}

	}

}
