package Comissao;

public class ComissaoModel {
    
    private int valor;
    private int qntVendas;
    private int comissao;

    public ComissaoModel(int valor, int qntVendas, int comissao) {
        this.valor = valor;
        this.qntVendas = qntVendas;
        this.comissao = comissao;
    }

    public ComissaoModel() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }
    
}
