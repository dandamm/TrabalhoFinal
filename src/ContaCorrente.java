
public class ContaCorrente {
	
	private double saldo, chequeEspecial = 500;

	public ContaCorrente(double saldo) {
		
		this.saldo = saldo;
	}


	public double getSaldo() {
		return saldo;
	}
	public double setChequeEspecial(double chequeEspecial){
		this.chequeEspecial= chequeEspecial;
		return chequeEspecial;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Novo saldo: " + this.getSaldo());
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque efetuado. Saldo atual: " + this.getSaldo());
		} 
		else if (valor > this.saldo && valor<=this.saldo+this.chequeEspecial) {
			this.chequeEspecial = this.saldo + this.chequeEspecial - valor;
			System.out.println("Seu saldo está sendo retirado do seu Cheque Especial e você pagará 50 reais como taxa");
			this.chequeEspecial = this.chequeEspecial - 50;
			System.out.println("Saldo restante no cheque especial " + this.getChequeEspecial());
			
		} 
		else {
			System.out.println("Seu saldo é insuficiente.");
		}
	}

	public void transferirContaPoupanca(double valor) {
		if(valor<=this.saldo){
			this.saldo = (this.saldo - valor) - 1;
			System.out.println("Foi depositado para a conta Poupança o valor de: " + valor + " Seu saldo atual é: "  + this.getSaldo() + " reais. Você pagou 1 real em taxa de transferência!");
		}
		else{
			System.out.println("Saldo insufiente. Transferência negada.");
		}

	}
	public void verSaldo(){
		System.out.println(getSaldo());
	}

}
