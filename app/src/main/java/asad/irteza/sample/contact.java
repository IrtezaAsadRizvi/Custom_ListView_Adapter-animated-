package asad.irteza.sample;

/**
 * Created by Irteza on 25-May-17.
 */

public class contact {
    private int imageResource;
    private String name;
    private String email;
    public contact(int imageResource,String name,String email){
        this.imageResource = imageResource;
        this.name = name;
        this.email = email;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
