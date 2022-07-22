package br.com.xavier.poo;

import br.com.xavier.poo.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devXav = new Dev();
        devXav.setName("Camila");
        devXav.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dev:" + devXav.getConteudosInscritos());
        devXav.progredir();
        devXav.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dev:" + devXav.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dev:" + devXav.getConteudosConcluidos());
        System.out.println("XP:" + devXav.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
