package br.com.xavier.poo;

import br.com.xavier.poo.domain.Curso;
import br.com.xavier.poo.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("java");
        curso.setDescricao("legal");
        curso.setCargaHoraria(50);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("legal");
        mentoria.setDescricao("legal tbm");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
