public class PathFinderFactory {
    private static carPathFinder carPathFinder=new carPathFinder();
    private static walkPathFinder walkPathFinder=new walkPathFinder();
    private static publicPathFinder publicPathFinder=new publicPathFinder();
    public static PathFinder findPath(Mode mode){
        if(mode==Mode.CAR){
            return carPathFinder;
        }
        else if(mode==Mode.WALK){
            return walkPathFinder;
        }
        else if(mode==Mode.PUBLIC){
            return publicPathFinder;
        }
        return null;
    }
}
