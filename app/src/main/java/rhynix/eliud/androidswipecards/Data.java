package rhynix.eliud.androidswipecards;

/**
 * Created by eliud on 12/8/16.
 */

public class Data {

    private String description;
    private String imagePath;

    public Data(String imagePath,String description){

        this.imagePath = imagePath;
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }
}
