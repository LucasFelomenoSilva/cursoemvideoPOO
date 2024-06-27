package aula13;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Lucas", 21, "M", "lucassilva");
        u[1] = new Usuario("Carla", 24, "F", "carlateste");

        System.out.println(v[0].toString());
        System.out.println(u[0].toString());
    }

}
