package padroescriacao.abstractfactory;

public class Petshop {

    private Recibo recibo;
    private Prodpet prodpet;

    public Petshop(FabricaAbstrata fabrica) {
        this.recibo = fabrica.createRecibo();
        this.produtos = fabrica.createProdpet();
    }

    public String emitirRecibo() {
        return this.recibo.emitir();
    }

    public String emitirProdpet() {
        return this.prodpet.emitir();
    }
}
