package teste;

public class TesteContas {

	public static void main(String[] args) throws modelo.SaldoInsuficienteException{
		
		int a = 3;
		int b = a / 0;
		
		
		modelo.ContaCorrente outra = null;
		outra.deposita(200.0); 
					
		modelo.ContaCorrente cc = new modelo.ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		modelo.ContaPoupanca cp = new modelo.ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());


	}

}
