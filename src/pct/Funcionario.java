/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Arthur
 */
public class Funcionario {
    
    private int numero;
    private String nome;
    private double salario;
    
    public void apresentarFuncionario () {
        System.out.println("Numero ID: "+getNumero());
        System.out.println("Nome: "+getNome());
        System.out.println("Salário: "+ getSalario());
    }
    
    public void calcularSalario () {
        setSalario(getSalario() * 0.9);
        System.out.println("Salário com Desconto: " + getSalario());
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(int numero, String nome, double salario) {
        this.numero = numero;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
        setNome("Funcionario não definido");
    }
    
    
    
   
    
}
