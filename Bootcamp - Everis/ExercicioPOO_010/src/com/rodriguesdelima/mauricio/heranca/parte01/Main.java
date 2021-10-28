package com.rodriguesdelima.mauricio.heranca.parte01;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Faviana");

        p1.setSexo('M');
        p4.setSexo('F');
        p2.setIdade(18);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //p1.receberAumento(550.20) 	// A classe pessoa não possui atributo para aumento
        //p2.mudarTrabalho()		// A classe Aluno não comporta mudança de trabalho, métodos não existe.
        //p3.cancelarMatricula()		// A classe Professor não existe o método cancelarMatricula.

        //System.out.println(p1.toString());
        //System.out.println(p2.toString());
        //System.out.println(p3.toString());
        //System.out.println(p4.toString());


    }
}
