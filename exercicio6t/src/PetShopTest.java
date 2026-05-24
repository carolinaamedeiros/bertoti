import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class PetShopTest {

    @Test
    void adicionarServico() {
        PetShop petShop = new PetShop();
        Servico servico = new Servico("banho",50.0);
        servico.exibirConfirmacao();
        petShop.adicionarServico(servico);
        Assertions.assertEquals(1, petShop.getServicos().size());
    }
}