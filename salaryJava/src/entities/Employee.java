package entities;

public class Employee {

	String nome;
	double grossSalary;

	public Employee() {

	}

	public Employee(String nome, double grossSalary) {
		this.nome = nome;
		this.grossSalary = grossSalary;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

}
