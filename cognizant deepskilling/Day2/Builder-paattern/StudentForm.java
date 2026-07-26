class Student{
    String name;
    int age;
    String place;
    String mobileNO;
    private Student(StudentBuilder buildser){
        this.name=buildser.name;
        this.age=buildser.age;
        this.place=buildser.place;
        this.mobileNO=buildser.moblieNO;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + place);
        System.out.println("MobileNo : " + mobileNO);
    }
    static class StudentBuilder{
        private String name;
        private int age;
        private String place;
        private String moblieNO;
        public StudentBuilder Setname(String name){
            this.name=name;
            return this;
        }
        public StudentBuilder Setage(int age){
            this.age=age;
            return this;
        }
        public StudentBuilder Setplace(String place){
            this.place=place;
            return this;
        }
        public StudentBuilder SetmobileNo(String moblieNO){
            this.moblieNO=moblieNO;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}

public class StudentForm{
    public static void main(String[] args){
        Student a = new Student.StudentBuilder()
                    .Setname("kavin")
                    .Setage(21)
                    .Setplace("pollachi")
                    .SetmobileNo("7603801410")
                    .build();
        a.display();
    }
}