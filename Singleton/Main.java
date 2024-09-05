public class Main {
    public static void main(String[] args) {
        DbConn db1=DbConn.getInstance("a","b","c");
        DbConn db2=DbConn.getInstance("c","e","f");
    }
}