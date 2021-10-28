package com.rodriguesdelima.mauricio.heranca.parte01;

public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;

    // Métodos
    public void cancelarMartricula(){
        System.out.println("Matrícula será cancelada. ");
    }

    // Métodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
