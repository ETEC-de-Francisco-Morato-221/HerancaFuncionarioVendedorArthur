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
public class Vendedor extends Funcionario {
    
    private int percentualComissao;
    
    public void apresentarVendedor() {
        System.out.println("Comissão: " + getPercentualComissao() + "%");
    }
   
    public void calcularSalarioVendedor () {
        setSalario(getSalario() * 0.9);
        setSalario((getSalario() * 0.2) + getSalario());
        System.out.println("Salário com Desconto e Comissão: " + getSalario());
    }

    /**
     * @return the percentualComissao
     */
    public int getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * @param percentualComissao the percentualComissao to set
     */
    public void setPercentualComissao(int percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public Vendedor(int percentualComissao, int numero, String nome, double salario) {
        super(numero, nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public Vendedor() {
        super.setNome("Funcionario não definido");
    }
    
    
    
   
    
}
