
import java.util.ArrayList; // foi importado do package por ser uma classe

public class Arraylists {
    static  public void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>(); // não tem limite como o array
        nomes.add("Dani");
        nomes.add("Ed");
        nomes.add("Justin");
        nomes.add("Adele");
        System.out.println(nomes);
        System.out.println(nomes.get(1));

        nomes.remove(1);
        nomes.remove("Adele");//pode remover pelo índice e pelo valor

        System.out.println(nomes.get(1));
        System.out.println(nomes);
    }
}
