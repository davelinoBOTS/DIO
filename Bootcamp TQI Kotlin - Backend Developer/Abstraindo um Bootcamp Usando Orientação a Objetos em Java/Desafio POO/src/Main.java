import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso primerioCurso = new Curso();
        primerioCurso.setTitulo("Princípios de Agilidade e Desenvolvimento de Software");
        primerioCurso.setDescricao("Descrição detalhada do curso Princípios de Agilidade e Desenvolvimento de Software");
        primerioCurso.setCargaHoraria(20);

        Curso segundoCurso = new Curso();
        segundoCurso.setTitulo("Docker Fundamentals");
        segundoCurso.setDescricao("Descrição detalhada do curso Docker Fundamentals");
        segundoCurso.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria para o Bootcamp TQI");
        mentoria.setDescricao("Descrição completa para a mentoria do Bootcamp TQI");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp TQI Kotlin - Backend Developer");
        bootcamp.setDescricao("O Bootcamp TQI Kotlin - Backend Developer é um programa gratuito para formação de profissionais que estão iniciando sua carreira e buscam mais conhecimento técnico em desenvolvimento back-end.");
        bootcamp.getConteudos().add(primerioCurso);
        bootcamp.getConteudos().add(segundoCurso);
        bootcamp.getConteudos().add(mentoria);

        Dev primeiroDev = new Dev();
        primeiroDev.setNome("Dev Primeiro");
        Dev segundoDev = new Dev();
        primeiroDev.setNome("Dev Segundo");

        // Conteudos Inscritos
        System.out.println("----------------------------------------");
        System.out.println("INSCRITOS: "+primeiroDev.getConteudosInscritos());
        System.out.println("INSCRITOS: "+segundoDev.getConteudosInscritos());
        System.out.println("----------------------------------------");

        primeiroDev.inscreverBootcamp(bootcamp);
        segundoDev.inscreverBootcamp(bootcamp);

        // Conteudos Inscritos
        System.out.println("----------------------------------------");
        System.out.println("INSCRITOS: "+primeiroDev.getConteudosInscritos());
        System.out.println("INSCRITOS: "+segundoDev.getConteudosInscritos());
        System.out.println("----------------------------------------");

        // Conteudos concluidos
        System.out.println("----------------------------------------");
        System.out.println("CONCLUIDOS: "+primeiroDev.getConteudosConcluidos());
        System.out.println("INSCRITOS: "+primeiroDev.getConteudosInscritos());
        System.out.println("TOTAL XP: "+primeiroDev.calcularTotalXp());
        System.out.println("CONCLUIDOS: "+segundoDev.getConteudosConcluidos());
        System.out.println("INSCRITOS: "+segundoDev.getConteudosInscritos());
        System.out.println("TOTAL XP: "+segundoDev.calcularTotalXp());
        System.out.println("----------------------------------------");

        primeiroDev.progredir();
        primeiroDev.progredir();
        segundoDev.progredir();

        // Conteudos concluidos
        System.out.println("----------------------------------------");
        System.out.println("CONCLUIDOS: "+primeiroDev.getConteudosConcluidos());
        System.out.println("INSCRITOS: "+primeiroDev.getConteudosInscritos());
        System.out.println("TOTAL XP: "+primeiroDev.calcularTotalXp());
        System.out.println("CONCLUIDOS: "+segundoDev.getConteudosConcluidos());
        System.out.println("INSCRITOS: "+segundoDev.getConteudosInscritos());
        System.out.println("TOTAL XP: "+segundoDev.calcularTotalXp());
        System.out.println("----------------------------------------");

        // Conteudos Concluidos
    }
}