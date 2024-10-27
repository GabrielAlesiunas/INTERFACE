package Funcionario;

//Classe Main para testes
public class Main {
    public static void main(String[] args) {
        // Criando um funcionário assalariado
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(1714);
        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());

        // Criando um funcionário horista
        Funcionario funcionarioHorista = new FuncionarioHorista(2410);
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}