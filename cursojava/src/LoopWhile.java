public class LoopWhile {
    public static void main(String[] args){
        int count = 0;
        
        while (count < 10){// executa enquanto está na condição
            System.out.println("Estou no While" + " " + count);
            count++; //caso esqueça de atualizar a variável, entra num loop infinito

        }
    }
}
