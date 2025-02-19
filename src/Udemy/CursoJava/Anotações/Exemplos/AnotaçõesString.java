package Udemy.CursoJava.Anotações.Exemplos;

public class AnotaçõesString {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();

        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");

        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        // tolowerCase deixa toda string minuscula já o toUpperCase deixa no maiusculo

        System.out.println("trim: -" + s03 + "-");
        // elimina os espaços nos cantos da string

        System.out.println("substring(2): -" + s04 + "-");
        // ele pega a string apartir da segunda posição (2)

        System.out.println("substring(2, 9): -" + s05 + "-");
        // ele recorta apartir do caracter 9

        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        // ele sempre que achar um a minusculo ele troca por x nesse caso ele é um reposicionador
        // funciona para substring também

        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);


    }
}
