package Strings;

public class Ex3 {
    public static void main(String[] args) {
        //Scrie un program care citeste de la tastatura un String
        // si il afiseaza in consola consola caracter cu caracter (cate un caracter pe fiecare linie)
        String word = "abcdefgh";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        char[] wordchars = word.toCharArray();
        for (int i = 0; i < wordchars.length; i++) {
            System.out.println(wordchars[i]);
        }
        String[] words = {"apple", "banana", "cherry"};
        System.out.println(words[1].charAt(0));
        //ori
        char[] chars = words[1].toCharArray();
        System.out.println(chars[0]);
        for (int i = 0; i < words.length; i++) {
           // System.out.println(words[i]);
            String currentWord = words[i];
            for (int j = 0; j < currentWord.length(); j++) {
                System.out.println(currentWord.charAt(j));
            }
        }
    }

}
