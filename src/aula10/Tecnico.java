package aula10;

public class Tecnico extends Aluno{
    private int registoProfissional;

    public void praticar() {
        System.out.println(this.getNome() + " está praticando " + this.getCurso());
    }

    public int getRegistoProfissional() {
        return registoProfissional;
    }

    public void setRegistoProfissional(int registoProfissional) {
        this.registoProfissional = registoProfissional;
    }
}
