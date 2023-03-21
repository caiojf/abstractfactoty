package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetshopTest {

    @Test
    void deveEmitirTroca() {
        FabricaAbstrata fabrica = new FabricaTroca();
        Petstop petshop = new Petshop(fabrica);
        assertEquals("Recibo de Troca de Produto do petshop", petshop.emitirRecibo());
    }

    @Test
    void deveEmitirCompraVenda() {
        FabricaAbstrata fabrica = new FabricaCompraVenda();
        Petshop petshop = new Petshop(fabrica);
        assertEquals("Recibo Compra e Venda do petshop", petshop.emitirRecibo());
    }

}