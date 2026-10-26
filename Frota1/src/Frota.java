import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Carro> carros; // Boa prática: programar voltado à interface (List)

    // criação do construtor (sem parametros) - caetano
    public Frota (){
        this.carros = new ArrayList<>();
    }

    // criação dos metodos: adicionar carro(add do proprio array list), pesquisar carro --> dentro dos slides de encapsulamento, remover carro
    // caetano

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    } //correto

    public Carro pesquisarPlaca(String procurarPlaca){
        for (Carro carroAtual : carros) {
            if (carroAtual.getPlaca().equals(procurarPlaca)) {
                return carroAtual;
            }
        }
        return null;
    }

    public boolean removerCarro(String placaPesquisada){
        if (pesquisarPlaca(placaPesquisada)!=null){
            carros.remove(placaPesquisada);
            return true;
        }
        return false;
    }

}
