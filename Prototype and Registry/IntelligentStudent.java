public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(){

    }
    public IntelligentStudent(IntelligentStudent is){
        //Super constuctor to student constructor
        super(is);
        this.iq=is.iq;
    }
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
