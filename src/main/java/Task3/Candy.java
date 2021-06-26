package Task3;

public class Candy extends AllSladosti{

    private String vid;

    public Candy(String name, int ves, int price, String vid) {
        super(name, ves, price);
        this.vid = vid;
    }

    public String getVid() {
        return vid;
    }

//    public void setVid(String vid) {
//        this.vid = vid;
//    }
}
