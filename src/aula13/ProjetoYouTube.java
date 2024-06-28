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

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(u[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(u[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());

        /*System.out.println("VÍDEOS\n-----------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("USUÁRIOS\n-----------------------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());*/


    }

}
