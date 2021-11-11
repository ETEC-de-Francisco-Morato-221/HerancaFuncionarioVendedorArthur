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
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
         
        funcionario.setNumero(1);
        funcionario.setNome("Arthur");
        funcionario.setSalario(1545.00);
        
        System.out.println("\n\t\t\t  Funcionario 1 \n");
        funcionario.apresentarFuncionario();
        funcionario.calcularSalario();
        
        Funcionario funcionario2 = new Funcionario(2, "Roberto", 1797.50);
         
        System.out.println("\n\t\t\t  Funcionario 2 \n");
        funcionario2.apresentarFuncionario();
        funcionario2.calcularSalario(); 
        
        Vendedor vendedor = new Vendedor();
        
        vendedor.setPercentualComissao(20);
        vendedor.setNumero(3);
        vendedor.setNome("Ronaldo");   
        vendedor.setSalario(2500.00);
        
        
        System.out.println("\n\t\t\t  Vendedor 1 \n");
        vendedor.apresentarFuncionario();
        vendedor.calcularSalarioVendedor();
        
        Vendedor vendedor2 = new Vendedor(20, 4, "Marcio", 3000.00);
        
        System.out.println("\n\t\t\t  Vendedor 2 \n");
        vendedor2.apresentarFuncionario();
        vendedor2.calcularSalarioVendedor();
        
        
        
        
  
        
        
    }
    
}
