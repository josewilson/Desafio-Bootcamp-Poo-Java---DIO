import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String descricao;
    private String instrutor;
    private List<Dev> participantes;

    public Curso(String nome, String descricao, String instrutor) {
        this.nome = nome;
        this.descricao = descricao;
        this.instrutor = instrutor;
        this.participantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public List<Dev> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Dev> participantes) {
        this.participantes = participantes;
    }

    public void adicionarParticipante(Dev dev) {
        participantes.add(dev);
    }
}
