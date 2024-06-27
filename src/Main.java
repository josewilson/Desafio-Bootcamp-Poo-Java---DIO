import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcampJava = new Bootcamp("Bootcamp de Java", "São Paulo", "01/08/2024");
        Curso cursoJava = new Curso("Java Fundamentos", "Curso básico de Java", "Ana Souza");
        Mentoria mentoriaJava = new Mentoria("Orientação a Objetos", "02/08/2024 15:00", "Pedro Santos");
        Dev devMaria = new Dev("Maria", "Iniciante", Arrays.asList("Web Development", "Mobile Apps"));

        bootcampJava.adicionarCurso(cursoJava);
        bootcampJava.adicionarMentoria(mentoriaJava);

        devMaria.participarDeCurso(cursoJava);
        devMaria.participarDeMentoria(mentoriaJava);

        // Exemplo de acesso aos dados usando getters
        System.out.println("Bootcamp: " + bootcampJava.getNome());
        System.out.println("Cursos no bootcamp:");
        for (Curso curso : bootcampJava.getCursos()) {
            System.out.println("- " + curso.getNome());
        }
        System.out.println("Mentorias no bootcamp:");
        for (Mentoria mentoria : bootcampJava.getMentorias()) {
            System.out.println("- " + mentoria.getAssunto());
        }
        System.out.println("Dev Maria está participando de:");
        for (Curso curso : devMaria.getCursosParticipados()) {
            System.out.println("- Curso: " + curso.getNome());
        }
        for (Mentoria mentoria : devMaria.getMentoriasParticipadas()) {
            System.out.println("- Mentoria: " + mentoria.getAssunto());
        }
    }
}
