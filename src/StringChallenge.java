public class StringChallenge {

    public static void main(String[] args) {

        String text = "123456789";

        String newWord = text.replaceAll(".", "x");
        System.out.println("new word: " + newWord);

        String newWord2 = text.replaceAll("(?s)." , "*");
        System.out.println("new word 2: " + newWord2);

        System.out.println("s".repeat(text.length()));





    }

}
