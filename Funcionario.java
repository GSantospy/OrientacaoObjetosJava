public class Funcionario extends Pessoa{
    public double salario;

    public Funcionario() {
        super();
        this.salario = 0;
    }

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println(String.format("Salário: %.2f", salario));
    }
}
