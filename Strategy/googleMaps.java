//Strategy design pattern
//Why? It is required when there are multiple ways of doing the thing.
//Example : Google Maps find the route on different mode like bus,car,train,walk etc.
// Solution : Create separate classes for each way(mode).
//In order to create separate classes we will create interface and implement that methods in that classes.
// Here PathFinder is an interface and that is implemented in several modes.

public class googleMaps {
    private PathFinder pathFinder;

    //Here we are using factory method in order to select the mode of transport.
    public void findPath(String source,String destination,Mode mode){
        pathFinder=PathFinderFactory.findPath(mode);
        pathFinder.pathFinder(source,destination);
    }
}
