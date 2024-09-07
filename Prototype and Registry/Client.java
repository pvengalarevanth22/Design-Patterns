public class Client {

    public static void loadRegistry(Registry registry){
        Student aprBatch=new Student();
        aprBatch.setBatch("April24Batch");
        aprBatch.setAvgPsp(90.5);

        registry.setRegisterMap("April24Batch",aprBatch);

        IntelligentStudent is=new IntelligentStudent();
        is.setBatch("June24Batch");
        is.setAvgPsp(99);
        is.setIq(120);

        registry.setRegisterMap("June24Batch",is);

    }
    public static void main(String[] args) {
        Registry registry=new Registry();
        loadRegistry(registry);

        //Makes deep copy of the prototype from class itself by calling clone method
        Student revanth=registry.getPrototype("April24Batch").clone();
        revanth.setName("Revanth");
        revanth.setCity("Rjy");
        revanth.setStudentNo(123);

        Student chinnu=registry.getPrototype("June24Batch").clone();
        chinnu.setName("chinnu");
        chinnu.setCity("nellore");
        chinnu.setStudentNo(345);
    }
}
