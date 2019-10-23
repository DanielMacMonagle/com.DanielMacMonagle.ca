import javax.swing.*;

public class StudentDriverSystem extends UnderGrad{
    public static void main(String[] args) {

        Student s1 = new Student("David Clifford",20,"Maths","Full Time");
        Student s2 = new Student( "Louise Buckley",23,"Web Dev","Full Time");

        JOptionPane.showMessageDialog(null,s1.toString() + "\n\n" + s2.toString());

    }

}
