package padroescriacao.abstractfactory;

public class CompraVenda implements Recibo {

    public String emitir() {
        return "Recibo de Compra e Venda de Produtos do pet";
    }
}
