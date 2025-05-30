/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.mavenproject1;

import br.com.ifba.mavenproject1.entity.Aluno;
import br.com.ifba.mavenproject1.entity.Curso;
import br.com.ifba.mavenproject1.entity.Disciplina;
import br.com.ifba.mavenproject1.entity.Professor;
import br.com.ifba.mavenproject1.entity.Responsavel;
import br.com.ifba.mavenproject1.entity.Turma;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1591
 */
public class Mavenproject1 {

    public static void main(String[] args) {
       
        List<Aluno> alunos = new ArrayList<>();
        
        Aluno aluno1 = new Aluno("Luan","74991028866","20232ireads0017@ifba.edu.br", "123423569","0017", null, null);

                 
        alunos.add(aluno1);
        
        Responsavel responsavel = new Responsavel("Pai do Luan", "74991894326", "zezeze@gamil.com", "1234124311", aluno1);
        
        aluno1.setResponsavel(responsavel);

        List<Curso> cursos = new ArrayList<>();
        
        //----------------------------------
        
        List<Disciplina> disciplinas = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        
        Disciplina disciplina =  new Disciplina("POO", "prg25", new ArrayList<>());
        
         
        Professor professor = new Professor("Jonatas", "749920348","JonatasDaMotorola@gmail.com", "0239523905", "siapeNew", cursos, new ArrayList<>());
        
        professores.add(professor);
        
        disciplina.setProfessores(professores);
        
        disciplinas.add(disciplina);
        
        professor.setDiciplinas(disciplinas);
        
        
        //-----------------------------------
        
        Curso curso = new Curso("Analise e Desenvolvimento de Sistemas", "ADS", professor);

        
        cursos.add(curso);

 
        
        Turma turma = new Turma("Turma POO", 2025, alunos, disciplinas, cursos);
        
        aluno1.setTurma(turma);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Apenas a parte a baixo foi gerada po IA e os metodos ToString, Todo restante foi feito por: @ Luan Alves.
        
        
        System.out.println("===== CURSOS =====");
        for (Curso cursoA : cursos) {
            System.out.println(cursoA);
            System.out.println("  Professor responsavel: " + curso.getServidor().getNome());
        }

        System.out.println("\n===== PROFESSORES =====");
        for (Professor prof : professores) {
            System.out.println(prof);
            System.out.println("  Disciplinas que leciona:");
            for (Disciplina disc : prof.getDiciplinas()) {
                System.out.println("    - " + disc.getNome());
            }
        }

        System.out.println("\n===== DISCIPLINAS =====");
        for (Disciplina disc : disciplinas) {
            System.out.println(disc);
            System.out.println("  Professores que lecionam:");
            for (Professor prof : disc.getProfessores()) {
                System.out.println("    - " + prof.getNome());
            }
        }

        System.out.println("\n===== TURMA =====");
        System.out.println(turma);
        System.out.println("  Alunos da turma:");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println("    - " + aluno.getNome());
        }

        System.out.println("\n===== ALUNOS =====");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            System.out.println("  Responsavel: " + aluno.getResponsavel().getNome());
            System.out.println("  Turma: " + aluno.getTurma().getNome());
        }

        System.out.println("\n===== RESPONSAVEIS =====");
        System.out.println(responsavel);
        System.out.println("  Aluno vinculado: " + responsavel.getAluno().getNome());


        //
        
    }
}
