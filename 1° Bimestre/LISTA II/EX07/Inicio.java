package br.com.EX07;
import br.com.EX07.Funcionario;

public class Inicio {

	public static void main(String args[]) {
		
		java.util.Scanner leitura = new java.util.Scanner(System.in);
		Funcionario empregado = new Funcionario();
		
		System.out.printf("Insira a quantidade de horas trabalhadas: ");
		empregado.horasTrabalhadas = leitura.nextInt();
		
		System.out.printf("Valor da hora normal: ");
		empregado.valorHoraNormal = leitura.nextDouble();
		
		if(empregado.horasTrabalhadas <=  40) {
			empregado.salarioBruto = empregado.horasTrabalhadas * empregado.valorHoraNormal;
			System.out.printf("Salário bruto: R$ %.2f", empregado.salarioBruto);
		}
		else {
			double extra = 0;		
			extra = empregado.horasTrabalhadas - 40;
			
			empregado.salarioBruto = (empregado.horasTrabalhadas - extra) * empregado.valorHoraNormal;	
			
			empregado.valorHoraNormal = (empregado.valorHoraNormal / 2)  + empregado.valorHoraNormal;
			extra = extra * empregado.valorHoraNormal;
			
			empregado.salarioBruto = empregado.salarioBruto + extra;	
			System.out.printf("Salário bruto: R$ %.2f", empregado.salarioBruto);
						
		}
		
	}
}
