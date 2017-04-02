import java.util.Scanner;

public class AppConta {

	public static void main(String[] args) {
		int opcao;
		double valorOperacao;
		Scanner entrada = new Scanner(System.in);
		ContaCorrente contaCorrente = new ContaCorrente(600.00);
		ContaPoupanca contaPoupanca = new ContaPoupanca(700.00);

		do {
			System.out.println("Escolha uma operação:");
			System.out.println("CONTA CORRENTE");
			System.out.println("CONTA POUPANÇA");
			System.out.println("CANCELAR");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("DEPOSITAR");
				System.out.println("SACAR");
				System.out.println("SALDO");
				System.out.println("TRANSFERIR PARA CONTA POUPANÇA");
				System.out.println("CANCELAR");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1: {
					System.out.println("Informe o valor que deseja depositar para sua conta ");
					valorOperacao = entrada.nextDouble();
					contaCorrente.depositar(valorOperacao);
					break;
				}
				case 2: {
					System.out.println("Informe o valor que deseja sacar ");
					valorOperacao = entrada.nextDouble();
					contaCorrente.sacar(valorOperacao);
					break;
				}
				case 3: {
					contaCorrente.verSaldo();
					break;
				}
				case 4: {
					System.out.println("Informe o valor que deseja transferir para a conta Poupança ");
					valorOperacao = entrada.nextDouble();
					contaCorrente.transferirContaPoupanca(valorOperacao);
					break;
				}
				case 5: {
					System.out.println("FIM DA OPERAÇÃO");
					break;
				}
				default: {
					System.out.println("Opção inválida!");
				}
				}

			} else if (opcao == 2) {
				System.out.println("DEPOSITAR");
				System.out.println("SACAR");
				System.out.println("SALDO");
				System.out.println("TRANSFERIR PARA CONTA CORRENTE");
				System.out.println("CANCELAR");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1: {
					System.out.println("Informe o valor que deseja depositar para sua conta ");
					valorOperacao = entrada.nextDouble();
					contaPoupanca.depositar(valorOperacao);
					break;
				}
				case 2: {
					System.out.println("Informe o valor que deseja sacar ");
					valorOperacao = entrada.nextDouble();
					contaPoupanca.sacar(valorOperacao);
					break;
				}
				case 3: {
					contaPoupanca.verSaldo();
					break;
				}
				case 4: {
					System.out.println("Informe o valor que deseja transferir para a conta Corrente ");
					valorOperacao = entrada.nextDouble();
					contaPoupanca.transferirContaCorrente(valorOperacao);
					break;
				}
				case 5: {
					System.out.println("FIM DA OPERAÇÃO");
					break;
				}
				default: {
					System.out.println("Opção inválida!");
				}
				}

			}
		} while (opcao != 3);
		System.out.println("FIM DA OPERAÇÃO");
		entrada.close();
	}

}
