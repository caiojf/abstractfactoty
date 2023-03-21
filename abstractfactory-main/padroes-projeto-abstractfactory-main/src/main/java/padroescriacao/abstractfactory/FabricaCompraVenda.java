package padroescriacao.abstractfactory;

public class FabricaCompraVenda implements FabricaAbstrata {

    @Override
    public Recibo createRecibo() {
        return new CompraVenda();
    }
}
