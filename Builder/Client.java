public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setStudentNo(1234)
                .setName("Revanth")
                .setGrade("A+")
                .setPassingYear(2025)
                .setBatch("Web Development")
                .build();
    }

}
