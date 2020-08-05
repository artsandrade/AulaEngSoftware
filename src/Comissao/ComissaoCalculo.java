package Comissao;

import java.util.Scanner;

public class ComissaoCalculo {
    
    ComissaoModel comissao = new ComissaoModel();
    ComissaoVenda porcentagem = new ComissaoVenda();
    
    public void informarComissao(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o valor total das vendas: R$ ");
        comissao.setValor(ler.nextInt());
        
        System.out.print("Informe a quantidade de vendas: ");
        comissao.setQntVendas(ler.nextInt());
        
        comissao.setComissao(porcentagem.calcularComissao(comissao.getValor(), comissao.getQntVendas()));
        
        System.out.println("");
        System.out.println("Valor das vendas: R$ " + comissao.getValor());
        System.out.println("Quantidade de vendas: " + comissao.getQntVendas());
        System.out.println("Valor das comissões: R$ " + comissao.getComissao());
                
    }
}
