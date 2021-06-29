import java.util.ArrayList;

public class Hackathon {
    private String name;


    public Hackathon(String name){
        this.name = name;
    }

    public char getFirstChar(){
        return name.charAt(0);
    }

    public String getName(){
        return name;
    }
}
