package coms.example.k00na.practice_toolbar_slidingtab;

/**
 * Created by niggor on 8.8.2015.
 */
public class Person {

    private String name;
    private int imgRes;

    /*
        CONSTRUCTORS
     */

    public Person(int img){

        this.imgRes = img;
    }

    public Person(){

    }


    public Person(int img, String name){
        this.imgRes = img;
        this.name = name;
    }



    /*
        SETTERS AND GETTERS DOWN-BELLOW
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

}
