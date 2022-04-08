import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescrição("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescrição("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao(("Descrição Bootcamp Java Developer"));
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro");
        devLeandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devLeandro.getNome() + ":" + devLeandro.getConteudoInscritos());
        devLeandro.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos " + devLeandro.getNome() + ":" + devLeandro.getConteudoInscritos());
        devLeandro.progredir();
        System.out.println("-");

        System.out.println("Conteúdos concluídos " + devLeandro.getNome() + ":" + devLeandro.getConteudoInscritos());
        System.out.println("XP: " + devLeandro.calcularTotalXp());

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devFulano.getNome() + ":" + devFulano.getConteudoInscritos());
        devFulano.progredir();
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devFulano.getNome() + ":" + devFulano.getConteudoInscritos());
        System.out.println("Conteúdos concluídos " + devFulano.getNome() + ":" + devFulano.getConteudoInscritos());
        System.out.println("XP: " + devFulano.calcularTotalXp());


    }
}
