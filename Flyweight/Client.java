//Flyweight design pattern
//1.It is used when we have both intrinsic and extrinsic properties in the class.
//2.Intrinsic : properties that are constant or common for some features.
//3.Extrinsic : properties that are not common.
//Example: Pubg game has bullets option since bullet has so many features there will be some common features
//which will save some space
//Solution : create separate classes for both intrinsic and extrinsic classes and use that extrinsic in that intrinsic clas s

public class Client {
    public static void main(String[] args) {
        BulletIntrinsic bulletIntrinsic=new BulletIntrinsic();
        bulletIntrinsic.setImage("Image");
        bulletIntrinsic.setLength(10);
        bulletIntrinsic.setWeight(20);
        bulletIntrinsic.setRange(5);

        //We will create different bullets with same BulletIntrinsic object
        Bullet bullet=new Bullet(bulletIntrinsic);
        bullet.setDirection("east");
        bullet.setCoOrdinates("23N 33W");
    }
}
