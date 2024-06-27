package aula11;

public class App {
    public static void main(String[] args) {
//        Mamifero m = new Mamifero();
//        Reptil r = new Reptil();
//        Peixe p = new Peixe();
//        Ave a = new Ave();
//
//        m.setPeso(85.3f);
//        m.setIdade(2);
//        m.setMembros(4);
//        m.locomover();
//        m.alimentar();
//        m.emitirSom();
//
//        System.out.println("x-x-x-x-x-x-x-x-x");
//
//        p.setPeso(0.35f);
//        p.setIdade(1);
//        p.setMembros(0);
//        p.locomover();
//        p.alimentar();
//        p.emitirSom();
//        p.soltarBolha();
//
//        System.out.println("x-x-x-x-x-x-x-x-x");
//
//        a.setPeso(0.89f);
//        a.setIdade(2);
//        a.setMembros(2);
//        a.locomover();
//        a.alimentar();
//        a.emitirSom();
//        a.emitirSom();
//        a.fazerNinho();

        Mamifero m = new Mamifero();
        Cachorro k = new Cachorro();
        Canguru c = new Canguru();

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.setCorPelo("Preto");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
    }
}
