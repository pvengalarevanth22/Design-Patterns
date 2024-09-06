//Purpose of Builder design patters
//1.If there are so many attributes in a class.
//2.If there are validations so that object will not be created if there is invalid cases.
//3.If you want to create immutable classes.
//Ex : Idle to add configurations since there will be so many attributes.
public class Student {
    private int studentNo;
    private String name;
    private String grade;
    private int passingYear;
    private String batch;

    //Make Constructor private so that class will become immutable
    private Student(Builder builder){

        //Add validations here
        if(builder.getStudentNo()<=0){
            throw new RuntimeException("Invalid Student no");
        }
        studentNo= builder.getStudentNo();
        name=builder.getName();
        grade=builder.getGrade();
        passingYear=builder.getPassingYear();
        batch=builder.getBatch();
    }

    //Makes client life easier without creating new Object
    public static Builder getBuilder(){
        return new Builder();
    }

    //Place Builder as a inner class to student (As builder is tightly coupled to Student class no need of
    //placing outside student class)
    //Make Static class as there is no point of creating Builder class without student
    public static class Builder {
        private int studentNo;
        private String name;
        private String grade;
        private int passingYear;
        private String batch;
        public int getStudentNo() {
            return studentNo;
        }

        //Return builder object for constructor chaining
        public Builder setStudentNo(int studentNo) {
            this.studentNo = studentNo;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getGrade() {
            return grade;
        }

        public Builder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public int getPassingYear() {
            return passingYear;
        }

        public Builder setPassingYear(int passingYear) {
            this.passingYear = passingYear;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        //Create build method for creating student class as client don't need to create new Student explictly.
        public Student build(){
            return new Student(this);
        }

    }

}
