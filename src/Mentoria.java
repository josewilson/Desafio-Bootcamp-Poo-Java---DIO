import java.util.ArrayList;
import java.util.List;

public class Mentoria {
    private String assunto;
    private String dataHora;
    private String mentor;
    private List<Dev> participantes;

    public Mentoria(String assunto, String dataHora, String mentor) {
        this.assunto = assunto;
        this.dataHora = dataHora;
        this.mentor = mentor;
        this.participantes = new ArrayList<>();
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
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
