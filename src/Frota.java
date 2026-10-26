import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Carro> carros; // Boa prática: programar voltado à interface (List)

    // criação do construtor (sem parametros) - caetano
    public Frota (){
        this.carros = new ArrayList<>();
    }

    // criação dos metodos: adicionar carro(add do proprio array list), remover carro, pesquisar carro --> dentro dos slides de encapsulamento
    // caetano

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    } //correto

    //arrumar o pesquisarCarro
    public void pesquisarPlaca(String procurarPlaca){

    }

    //arrumar o removerCarro
    public void removerCarro(Carro carro){
        carros.remove(carro);
    }

}
