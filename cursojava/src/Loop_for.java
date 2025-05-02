import java.util.ArrayList;

public class Loop_for {
    static public void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Dani");
        nomes.add("Ed");
        nomes.add("Justin");
        nomes.add("Adele");

        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
