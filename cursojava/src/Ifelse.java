public class Ifelse {
    public static void main (String[] args){
        //boolean bool = true;
        //int b = 10;
        String nome =  "";
        //if (b >= 10){
          //  System.out.println("Verdadeiro");
        if (nome.equals("Dani")){
            System.out.println("Usuário logado");
        } else if (nome.isBlank()){//função que verifica se variável é vazia
            System.out.println("Faça login");
        } else {
            System.out.println("Falso");
        }
    }
}
