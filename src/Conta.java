
public class Conta {
	
	//variavel de classe conta
	double saldo = 10.0;
	
		public void sacar(double valor) {
			//variavel local do metodo
			double novoSaldo = saldo - valor;
		}
		
		public void imprimirSaldo() {
			//disponivel em toda classe
			System.out.println(saldo);
			//somente o metodo sacar conhece essa variavel
			// System.out.println(novoSaldo);
		}
		
		public double calcularDividaExponencial() {
			//variavel local de motodo
			double valorParcela = 50.0;
			double valorMontante = 0.0; //comecando a variavel com o valor 0
			
			for(int x=1;x<=5;x++) {//x variavel de escopo de fluxo
					//esta variavel sera reiniciada a cada execucao for
				double valorCalculado = valorParcela * x;
				valorMontante = valorMontante * valorCalculado;
				
				
			}//escopo de fluxo
			//x valorCalculado nunca estarão disponiveis fora do for
		//	return valorCalculado;
			return 0;
		}
	

}
