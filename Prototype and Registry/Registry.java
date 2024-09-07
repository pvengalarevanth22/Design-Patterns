import java.util.HashMap;
import java.util.Map;

//Registry design pattern just to store the prototypes
public class Registry {

    //Map for storing prototypes of type student
    private Map<String,Student> registerMap=new HashMap<String,Student>();

    public void setRegisterMap(String key,Student value ) {
        registerMap.put(key,value);
    }

    public Student getPrototype(String key){
        return registerMap.get(key);
    }
}
