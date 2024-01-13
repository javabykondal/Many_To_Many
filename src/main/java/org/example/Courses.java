package org.example;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private int id;
    @Column(name = "cname") private String CName;
    @Column(name = "cbal")private int cbal;
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    public Courses()
    {

    }
    public Courses(int id, String CName, int cbal) {
        this.id = id;
        this.CName = CName;
        this.cbal = cbal;
    }
    public Courses( String CName, int cbal) {

        this.CName = CName;
        this.cbal = cbal;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCName() {
        return CName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public int getCbal() {
        return cbal;
    }

    public void setCbal(int cbal) {
        this.cbal = cbal;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", CName='" + CName + '\'' +
                ", cbal=" + cbal +
                '}';
    }
}
