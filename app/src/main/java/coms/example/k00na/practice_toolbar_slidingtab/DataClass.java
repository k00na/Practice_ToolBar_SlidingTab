package coms.example.k00na.practice_toolbar_slidingtab;

import android.widget.ImageView;

/**
 * Created by k00na on 4.8.2015.
 */
public class DataClass {

    private ImageView image;
    private String name;

    private int[] scientists = {R.drawable.isac_newton, R.drawable.einstein, R.drawable.darwin_2};
    private int[] musicians = {R.drawable.snoop_dogg, R.drawable.gwen_stefani_2, R.drawable.ozzy_osbourne};
    private int[] politicians = {R.drawable.tito, R.drawable.malcom_x, R.drawable.ghadafi};

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScientists() {
        return scientists;
    }

    public void setScientists(int[] scientists) {
        this.scientists = scientists;
    }

    public int[] getMusicians() {
        return musicians;
    }

    public void setMusicians(int[] musicians) {
        this.musicians = musicians;
    }

    public int[] getPoliticians() {
        return politicians;
    }

    public void setPoliticians(int[] politicians) {
        this.politicians = politicians;
    }
}
