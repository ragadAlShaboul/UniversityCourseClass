import java.sql.Array;
import java.util.ArrayList;

public class UniversityCourse {
    private  String courseName;
    private String instructorName;
    private ArrayList<String> studentNames = new ArrayList<String>();
    public UniversityCourse(String courseName,String instructorName){
        this.courseName = courseName;
        this.instructorName = instructorName;
    }
    public void register(String studentName){
        if(studentNames == null){
            throw new IllegalArgumentException();
        }
        this.studentNames.add(studentName);
    }
    public void register(String[] studentNames){
        if(studentNames == null){
            throw new IllegalArgumentException();
        }
        for(int i=0;i<studentNames.length;i++){
            this.studentNames.add(studentNames[i]);
        }
    }
    public void drop(String studentName){

        this.studentNames.remove(studentName);

    }
     
}