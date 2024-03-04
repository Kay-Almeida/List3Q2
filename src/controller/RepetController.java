package controller;

public class RepetController {
	public RepetController() {
		super();
	}

	public int Funcaorepet(int n, int aux, int aux2) {
		// condição de parada definida pela diminuição de digitos de n
		if (n == 0) {
			return 0;
		} else {
			// aqui temp recebe a casa decimal que n vai perder e divide pela sua propria
			// casa decimal para comparar com aux e ver se o digito é igual se sim, soma 1 a função 
			int temp = (n % aux2);
			if ((temp / (aux2 / 10)) == aux) {
				n = n - (n % aux2);
				return 1 + Funcaorepet(n, aux, aux2 * 10);
			}
			n = n - (n % aux2);
			return Funcaorepet(n, aux, aux2 * 10);
		}

	}
}
