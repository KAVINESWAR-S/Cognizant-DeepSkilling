package Day3.Exercise.MVCPatternExample;

class student{
    String name;
    int id;
    String grade;
    public student(String name,int id,String grade){
        this.name=name;
        this.id=id;
        this.grade=grade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class studentview{
    public void displaystudent(String name,int id,String grade){
        System.out.println("The Student name is :"+name+"Id:"+id+"with grade of:"+grade);
    }
}

class studentcontroller{
    private student model;
    private studentview view;

    public studentcontroller(student model,studentview view){
        this.model=model;
        this.view=view;
    } 
    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.displaystudent(
                model.getName(),
                model.getId(),
                model.getGrade()
        );
    }
}
public class MVCPatternExample {
    public static void main(String[] args) {

        student model =
                new student("Kavin", 101, "A");

        studentview view =
                new studentview();

        studentcontroller controller =
                new studentcontroller(model, view);

        System.out.println("Initial Student Data\n");

        controller.updateView();

        System.out.println("\nAfter Updating\n");

        controller.setStudentName("Eswar");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
