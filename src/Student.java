public class Student implements Categorizable{

    protected String name;
    protected int age;
    protected String category, subjects;

    public Student(){
        this.name = "Unknown";
        this.age = 0;
    }//End No Argument Constructor

    public Student(String name, int age, String subjects, String category){
        this.name = name;
        this.age = age;
    }//End

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }//End

    public String toString(){
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nSubjects: " + getSubjects() +
                "\nCategory: " + getCategory();
    }//End String to String


    public void setCategory(String category){
       this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public String getSubjects(){
        return subjects;
    }

    public void setSubjects(String subjects){
        this.subjects = subjects;
    }

}
