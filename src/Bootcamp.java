import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String localizacao;
    private String dataInicio;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;

    public Bootcamp(String nome, String localizacao, String dataInicio) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.dataInicio = dataInicio;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }
}
