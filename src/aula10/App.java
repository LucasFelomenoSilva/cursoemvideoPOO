package aula10;

public class App {
    public static void main(String[] args) {
//      Pessoa p1 = new Pessoa();
//        Visitante v1 = new Visitante();
//        v1.setNome("Juvenal");
//        v1.setIdade(22);
//        v1.setSexo("M");
//        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setCurso("Java");
        a1.setIdade(21);
        a1.setSexo("M");
        a1.pagarMensalidade();

        System.out.println("----------");

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Maria");
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();

        System.out.println("----------");

        Tecnico t1 = new Tecnico();
        t1.setRegistoProfissional(1122);
        t1.setNome("Carlos");
        t1.setCurso("Informatica");
        t1.praticar();

        System.out.println("----------");

        Professor p1 = new Professor();
        p1.setNome("Pedro");
        p1.setEspecialidade("História");
        p1.setSalario(1120.00f);
        p1.receberAumento(500);


    }
}
