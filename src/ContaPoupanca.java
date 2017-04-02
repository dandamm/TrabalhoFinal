
public class ContaPoupanca {
	
	private double saldo;

	public ContaPoupanca(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Novo saldo: " + this.getSaldo());
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque efetuado. Saldo atual: " + this.getSaldo());
		} else {
			System.out.println("Seu saldo é insuficiente.");
		}
	}

	public void transferirContaCorrente(double valor) {
		if(valor<=this.saldo){
			this.saldo = (this.saldo - valor);
			System.out.println("Foi depositado para a conta Corrente o valor de: " + valor + " reais. Seu saldo atual é: "  + this.getSaldo());
		}
		else{
			System.out.println("Saldo insufiente. Transferência negada.");
		}

	}
	public void verSaldo(){
		System.out.println(getSaldo());
	}
}
