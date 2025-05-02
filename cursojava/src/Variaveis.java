public class Variaveis {
//todo arquivo java deve ter uma class, que precisa ter o mesmo nome do arquivo 
    public static void main(String[] args){
        byte b = -128; //entre -128 a 127, tamanho de 8 bits
        short s = 100; //entre -32.768 a 32.767, 16 bits
        int idade = 26; // -2.147.483.648 a 2.147.483.647, 32 
        long l = 100000000L;// -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807, 64 bits
        float f = 8.9f; // 32 bits, precisão simples
        double d = 1.23344556;
        char letraunica = 'a'; // usa-se aspas simples ''
        var nome = "Dani";
        String name = "Dani"; // usa-se aspas duplas
        boolean bool = true; // true ou false
        System.out.println(nome + " " + idade + b + s + l + f + d + letraunica + name + bool);
    }



}
