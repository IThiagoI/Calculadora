
package br.com.calculadora;

public class Calculadora {
	private double num1 = 0;
	private double num2 = 0;
	private String sinal;
	private double total = 0;
	
	public double getTotal() {
		return total;
	}
	
	public String getSinal() {
		return sinal;
	}
	
	public double getNum1() {
		return num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double soma() {
		this.sinal = "+";
		return this.total = this.num1 + this.num2;
		
	}
	
	public double subtracao() {
		this.sinal = "-";
		return this.total = this.num1 - this.num2;
	}
	
	public double multiplicacao() {
		this.sinal = "x";
		return this.total = this.num1 * this.num2;
	}
	
	public double divisao() {
		this.sinal = "/";
		return this.total = this.num1 / this.num2;
	}
	public double porcentagem() {
		this.sinal = "%";
		return this.total = this.num1 * (this.num2 / 100);
	}
}
