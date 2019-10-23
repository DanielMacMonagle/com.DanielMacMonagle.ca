public class UnderGrad extends Student{

    protected String category;
    protected String subjects;

    public UnderGrad(){
        this.subjects = "Unknown";
        this.category = "Unknown";
    }

    public UnderGrad(String subjects, String category){
        this.subjects = subjects;
        this.category = category;
    }

    public String getSubjects(){
        return subjects;
    }

    public void setSubjects(String subjects){
        this.subjects = subjects;
    }

    public String toString(){
        return "Subjects: " + getSubjects() +
                "\nCategory: " + getCategory();
    }
}
