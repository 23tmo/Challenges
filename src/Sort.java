import processing.core.PApplet;

public class Sort extends PApplet {
    private static Sort app;
    public Hackathon[] hackathons = {
            new Hackathon("Set up your Hacker Environment"),
            new Hackathon("Create an educational project"),
            new Hackathon("Build a clone of any card or board game"),
            new Hackathon("Build a fitness app"),
            new Hackathon("Paired programming session with another hacker"),
            new Hackathon("Write code to sort a list"),
            new Hackathon("Design your own season tee"),
            new Hackathon("Fork and star the new Jina Github Repository"),
            new Hackathon("Guess the 2022 season mascot")
    };

    public static void main(String[] args){
        app = new Sort();
        app.runSketch();
    }

    public Sort(){
    }

    public void settings(){
        size(1440, 872);
    }

    public void setup(){
        fill(0);

    }

    public void mouseClicked() {
        super.mouseClicked();
        for(int i = 0; i < 20; i++){
            if (mouseX > 1250 && mouseX < (1250 + 150) &&
                    mouseY > 10 && mouseY < (10 + 25)) {
                sort(hackathons);
            }
        }
    }

    public void draw(){
        background(0);
        int y = 200;
        for(int i = 0; i < hackathons.length; i++){
            textSize(15);
            text(hackathons[i].getName(),200, y);
            y += 50;
        }
        // "alphabetically sort" button
        fill(0);
        stroke(37, 174, 219);
        strokeWeight(5);
        rect(1250, 10, 150, 25);
        fill(37, 174, 219);
        textSize(15);
        text("sort challenges",1275, 28);
    }

    public static Sort getApp(){
        return app;
    }

    public  void sort(Hackathon[] hackathons) {
        for (int i = 0; i < hackathons.length; i++) {
            int minIndex = i;
            for (int next = i + 1; next < hackathons.length; next++) { // finding the index with the minimum amt of sugars
                if (hackathons[next].getFirstChar() < hackathons[i].getFirstChar()) {
                    minIndex = next;
                }
            }
            Hackathon temp = hackathons[minIndex];
            hackathons[minIndex] = hackathons[i];
            hackathons[i] = temp;
        }
    }

}
