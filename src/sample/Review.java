package sample;

public class Review {
    public KioskItem item;
    private long itemID = item.id;
    private double rating;
    private String text;

    public Review(KioskItem item) {
        this.item = item;
        this.itemID = item.id;
    }

    public long getItemID() {
        return itemID;
    }

    public void setItemID(long itemID) {
        this.itemID = itemID;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



    public void write()
    {

    }
}
