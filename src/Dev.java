import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private String nivelExperiencia;
    private List<String> interesses;
    private List<Curso> cursosParticipados;
    private List<Mentoria> mentoriasParticipadas;

    public Dev(String nome, String nivelExperiencia, List<String> interesses) {
        this.nome = nome;
        this.nivelExperiencia = nivelExperiencia;
        this.interesses = interesses;
        this.cursosParticipados = new ArrayList<>();
        this.mentoriasParticipadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public List<String> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<String> interesses) {
        this.interesses = interesses;
    }

    public List<Curso> getCursosParticipados() {
        return cursosParticipados;
    }

    public void setCursosParticipados(List<Curso> cursosParticipados) {
        this.cursosParticipados = cursosParticipados;
    }

    public List<Mentoria> getMentoriasParticipadas() {
        return mentoriasParticipadas;
    }

    public void setMentoriasParticipadas(List<Mentoria> mentoriasParticipadas) {
        this.mentoriasParticipadas = mentoriasParticipadas;
    }

    public void participarDeCurso(Curso curso) {
        cursosParticipados.add(curso);
    }

    public void participarDeMentoria(Mentoria mentoria) {
        mentoriasParticipadas.add(mentoria);
    }
}
