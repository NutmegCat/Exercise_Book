// Aaron Prince Anu

public class History extends Book {
    private String timePeriod;

    public History(String author, String title, String timePeriod) {

        super(title, author);
        this.timePeriod = timePeriod;
    }

    public String toString() {
        return super.toString() + " Time Period:  " + timePeriod;
    }
}