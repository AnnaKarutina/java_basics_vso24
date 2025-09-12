package week7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void add(){
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translate = reader.nextLine();
        this.dictionary.add(word, translate);
    }

    public void translate(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(word));
    }

    public void start(){
        System.out.println("Statement:");
        System.out.println("\tadd - adds a word pair to the dictionary");
        System.out.println("\ttranslate - asks a word and prints its translation");
        System.out.println("\tquit - quit the text user interface)");
        System.out.println();
        while(true){
            System.out.print("Statement: ");
            String statement = this.reader.nextLine();
            if(statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if(statement.equals("add")) {
                this.add();
            } else if(statement.equals("translate")) {
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
            System.out.println();
        }
    }
}
