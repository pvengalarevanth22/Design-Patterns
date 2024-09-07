//Why Prototype Design Pattern required?
//1.In the cases where we don't want to create an object from the scratch
//2.Where want to deep copy an object which has private variables,child classes and without violating OCP principle.

public class Student implements Prototype<Student>{
    private int studentNo;
    private String name;
    private String city;
    private String batch;
    private double avgPsp;

    private String fees="recieved";

    public Student(){

    }

    //Created constructor so that "fees" private member can be accessed in intelligent Student
    public Student(Student st){
        this.studentNo=st.studentNo;
        this.city=st.city;
        this.name=st.name;
        this.batch=st.batch;
        this.avgPsp=st.avgPsp;
        this.fees=st.fees;
    }
    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgPsp() {
        return avgPsp;
    }

    public void setAvgPsp(double avgPsp) {
        this.avgPsp = avgPsp;
    }

    //Clone method for making deep copy of the prototype
    @Override
    public Student clone() {
        return new Student(this);
    }
}
