package aula10;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento) {
        System.out.println(this.getNome() + ", professor de " + this.getEspecialidade() + ", tem o salario atual de: R$" + salario);
        System.out.println("E recebeu um aumento de: R$" + aumento);
        this.salario += aumento;
        System.out.println("Novo salário: R$" + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
