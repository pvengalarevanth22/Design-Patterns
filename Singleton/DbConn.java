import java.util.concurrent.locks.ReentrantLock;

public class DbConn {
    private String Url;
    private String userName;
    private String password;

    //Create static variable so that it will be at static level
    private static DbConn inst;

    //locks for multi threading application
    private static ReentrantLock lock=new ReentrantLock();

    //Making constructor private so that client can't access it
    private DbConn(String Url,String userName,String password){
        this.Url=Url;
        this.userName=userName;
        this.password=password;
    }

    //Dual null check locking
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
