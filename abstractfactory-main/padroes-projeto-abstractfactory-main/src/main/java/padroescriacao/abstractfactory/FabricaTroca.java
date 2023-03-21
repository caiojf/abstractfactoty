package padroescriacao.abstractfactory;

public class FabricaTroca implements FabricaAbstrata {

    @Override
    public Recibo createRecibo() {
        return new Troca();
    }
}
