package entities;

public class ContaBancaria {
	private String nome;
	private int numeroDaConta;
	private double saldo;
	
	public static final double TAXA = 5.00;
	
	public ContaBancaria(String nome, int numeroDaConta) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
	}
	
	public ContaBancaria(String nome, int numeroDaConta, double depositoInicial) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		depositar(depositoInicial);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public void saques(double saques) {
		this.saldo -= (saques + TAXA);
		
	}
	
	public String toString() {
		return "Conta: " + numeroDaConta + ", Nome: " + nome + ", Saldo: $" + saldo;
	}
	
}
