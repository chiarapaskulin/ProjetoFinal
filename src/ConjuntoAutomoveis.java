import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConjuntoAutomoveis {
    private List<Automovel> automoveis;

    public ConjuntoAutomoveis(){
        automoveis = new ArrayList<>();
    }

    public boolean addAutomovel(Automovel auto){
        try{
            automoveis.add(auto);
            return true;
        }catch(Exception e) {
            System.out.println("Automóvel inválido");
            return false;
        }
    }

    public List<Automovel> getAutomoveis(){
        return automoveis;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Lista de Automóveis cadastrados: \n");
        for(Automovel auto : automoveis){
            str.append("\nPlaca: " + auto.getPlaca() +
                       "\nModelo: " + auto.getModelo() +
                       "\nValor do Odômetro: " + auto.getValorOdometro());
            str.append("\nRendimento em Km/L: " +
                       "\nCusto médio por Km: R$" +
                       "\nValor gasto no mês atual até o momento R$" +
                       "\nValor gasto no mês passado: R$");
            str.append("\n");
        }
        return str.toString();
    }
}
