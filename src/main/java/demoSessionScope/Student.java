package demoSessionScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session")
public class Student {
    private String idStudent;
    private String name;
    private String classStudent;

    public Student(String idStudent, String name, String classStudent) {
        this.idStudent = idStudent;
        this.name = name;
        this.classStudent = classStudent;
    }

    public Student() {
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }
}
