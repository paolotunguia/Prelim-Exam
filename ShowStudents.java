 public class ShowStudent
{
    public static void main (String args[])
    {
        Student pupil = new Student();// 2 cannot resolve sybmol... points to 'S' in Student 
 
 
        pupil.showIDnumber();
        pupil.showPoints();
        pupil.showHours();
        System.out.println("The grade point average of the studnet created by constructor is "
            + pupil.getGradePoint()+"\n\n");
 
        Student s2 = new Student();// 2 cannot resolve sybmol points to 'S in Student
        s2.setIDnumber(1920991);
        s2.setPoints(12);
        s2.setHours(3);
        s2.showIDnumber();
        s2.showPoints();
        s2.showHours();
        System.out.println("GPA = "
            + s2.getGradePoint()+"\n");
 
    }
}