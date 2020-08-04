package Comissao;

public class ComissaoVenda {
    
    public int porcentagemComissao;
    
    public int calcularComissao(int valor, int qntVendas){
        
        if(qntVendas>=30){
            porcentagemComissao = valor * 10/100;
        }
        else{
            porcentagemComissao = valor * 1/100;
        }
        
        return porcentagemComissao;
    }
}
