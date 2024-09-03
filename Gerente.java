public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    public double calcularBonus() {
        return salario * bonus;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println(String.format("Bônus: %.2f", calcularBonus()));
    }
}
