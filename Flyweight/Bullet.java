public class Bullet {
    private String coOrdinates;
    private String direction;

    public String getCoOrdinates() {
        return coOrdinates;
    }

    public void setCoOrdinates(String coOrdinates) {
        this.coOrdinates = coOrdinates;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    private BulletIntrinsic bulletIntrinsic;

    public Bullet(BulletIntrinsic bulletIntrinsic){
        this.bulletIntrinsic=bulletIntrinsic;
    }
}
