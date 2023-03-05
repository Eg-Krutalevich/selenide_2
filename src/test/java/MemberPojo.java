import java.util.ArrayList;

public class MemberPojo {
    private String name;
    private String agency;
    private String image;
    private String wikipedia;
    private ArrayList<String>launches;
    private String status;
    private String id;

    public MemberPojo(String name, String agency, String image, String wikipedia, ArrayList<String> launches, String status, String id) {
        this.name = name;
        this.agency = agency;
        this.image = image;
        this.wikipedia = wikipedia;
        this.launches = launches;
        this.status = status;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public ArrayList<String> getLaunches() {
        return launches;
    }

    public void setLaunches(ArrayList<String> launches) {
        this.launches = launches;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
