package Funcionario;

//Classe Funcionario Assalariado com implemento da classe Funcionario
public class FuncionarioAssalariado implements Funcionario {
	//Atributo da classe Funcionario Assalariado
    private double salario;

    //Construtor da classe Funcionario Assalariado
    public FuncionarioAssalariado(double salario) {
        this.salario = salario;
    }

    //Função para calcular o bonus
    @Override
    public double calcularBonus() {
        return 5000.00; // Bônus fixo
    }
}