import java.util.concurrent.locks.ReentrantLock;

public class DbConn {
    private String Url;
    private String userName;
    private String password;
    private static DbConn inst;

    private static ReentrantLock lock=new ReentrantLock();
    private DbConn(String Url,String userName,String password){
        this.Url=Url;
        this.userName=userName;
        this.password=password;
    }

    public static DbConn getInstance(String Url,String userName,String password){
        if(inst==null){
            lock.lock();
                if(inst==null){
                    inst=new DbConn(Url,userName,password);
                }
            lock.unlock();
        }
        return inst;
    }

}
