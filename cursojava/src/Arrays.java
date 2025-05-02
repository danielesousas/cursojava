public class Arrays {
    public static void main(String[] args){
        int[] colecaoDeInteiros = {1, 2, 100, 55555};
        int[] meusNumeros = new int[2];
        meusNumeros[0] = 98;
        meusNumeros[1] = 2002;
        boolean[] colecaoDeBooleans = {false, true, true};//posso ter varios tipos de vetores
        char[] colecaoDeCaracteres = {'a', 'e', 'i', 'o', 'u'};
        

        System.out.println(colecaoDeInteiros[2]);
        System.out.println(colecaoDeBooleans.length);
        System.out.println(colecaoDeCaracteres[2]);
        System.out.println(meusNumeros.length);
    }
}
