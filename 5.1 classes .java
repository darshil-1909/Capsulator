public class classes {

    public static void main(String[] args) {

        Student s = new Student();
        s.setname("salman");
        s.setroll_no("7");

        System.out.println("Student name = " + s.getname());
        System.out.println("Student Roll no. = " + s.getroll_no());
    }
}

class Student {
    String name;
    String roll_no;

    public void setname(String name) {

        this.name = name;
    }

    public void setroll_no(String roll_no) {

        this.roll_no = roll_no;
    }

    public String getname() {
        return name;
    }

    public String getroll_no() {
        return roll_no;
    }

}