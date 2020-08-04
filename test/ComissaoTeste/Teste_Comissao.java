package ComissaoTeste;

import Comissao.ComissaoModel;
import Comissao.ComissaoVenda;
import junit.framework.TestCase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Teste_Comissao extends TestCase{
    
    ComissaoModel ct1 = new ComissaoModel();
    ComissaoModel ct2 = new ComissaoModel();
    ComissaoVenda porcentagem = new ComissaoVenda();
    
    @Test
    public void Teste_Comissao() {
        
        //CT Vendas>30
        ct1.setValor(12000);
        ct1.setQntVendas(32);
        ct1.setComissao(porcentagem.calcularComissao(ct1.getValor(), ct1.getQntVendas()));
        
        //CT Vendas<30
        ct2.setValor(8000);
        ct2.setQntVendas(10);
        ct2.setComissao(porcentagem.calcularComissao(ct2.getValor(), ct2.getQntVendas()));
        
        Assert.assertEquals(1200, ct1.getComissao());
        Assert.assertEquals(80, ct2.getComissao());
    }
    
}
