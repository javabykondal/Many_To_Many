package org.example;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "sid")
    private  int id;
    @Column(name = "sname")private String Name;
    @Column(name = "semail")private String Email;
    @Column(name = "sphone")private  Double phone;

    @ManyToMany
    @JoinTable(name = "stu_cou",
            joinColumns=@JoinColumn(name = "mysid",referencedColumnName = "sid"),
            inverseJoinColumns =@JoinColumn(name = "mycid",referencedColumnName = "cid"))

    private Set<Courses> courses;

    public Student() {
    }

    public Student(String name, String email, Double phone) {
        Name = name;
        Email = email;
        this.phone = phone;
    }

    public Student(int id, String name, String email, Double phone) {
        this.id = id;
        Name = name;
        Email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public Set<Courses> getCourses() {
        return courses;
    }

    public void setCourses(Set<Courses> courses) {
        this.courses = courses;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
