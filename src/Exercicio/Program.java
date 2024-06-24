package Exercicio;

public class Program {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];

        p[0] = new Pessoa("Lucas", 21, "M");
        p[1] = new Pessoa("Camila", 22, "F");

        l[0] = new Livro("Aprendendo JAVA", "Jose", 300, p[0]);
        l[1] = new Livro("Aprendendo Veterinaria", "Matias", 500, p[1]);

        l[0].folhear(50);
        System.out.println(l[0].detalhes());
    }
}
