
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumne_mati1
 */
public class JokeManager {

    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        if (this.jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        } else {

            System.out.println(jokes.get(index));
        }
        return jokes.get(index);
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }

    }

}
