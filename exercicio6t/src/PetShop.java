import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Servico> servicos = new ArrayList();

    public PetShop(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public List<Servico> getServicos() {
        return this.servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public PetShop() {
    }

    public void adicionarServico(Servico servico) {
        this.servicos.add(servico);
    }
}