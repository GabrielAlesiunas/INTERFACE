package Funcionario;

//Classe Funcionario Horista com implementpo da classe Funcionario
public class FuncionarioHorista implements Funcionario {
	//Atributos da classe Funcionario Horista
    private double totalAnualRecebido;

    //Construtor da classes Funcionario Horista
    public FuncionarioHorista(double totalAnualRecebido) {
        this.totalAnualRecebido = totalAnualRecebido;
    }

    //Função para calcular o bonus
    @Override
    public double calcularBonus() {
        return totalAnualRecebido * 0.10; // 10% do total anual recebido
    }
}