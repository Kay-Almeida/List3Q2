package view;

import controller.RepetController;

public class Principal {
	public static void main(String[] args) {
		RepetController rp = new RepetController();
		
	
		int n = 836363; 
		int aux = 3; 
		int aux2 = 10; 
		
		if(n>=10&&n<=999999) {
			if (aux>=0&&aux<=9) {
				int resultado = rp.Funcaorepet(n, aux, aux2);
				System.out.println("O número "+ aux + " é repetido "+ resultado+ " vezes em "+ n);
			}else {
				System.out.println("Entradas inválidas!!");
			}
		}else {
			System.out.println("Entradas inválidas!!");
		}
		
	}

}
