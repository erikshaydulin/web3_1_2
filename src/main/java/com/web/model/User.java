package com.web.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Min;



@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(min = 2, message = "Имя должно содержать как минимум 2 символа.")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Имя не должно содержать цифры, пробелы, спецсимволы")
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Size(min = 2, message = "Фамилия должна содержать как минимум 2 символа.")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Фамилия не должно содержать цифры, пробелы, спецсимволы")
    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Column(name = "department")
    private String department;

    @Min(value = 0, message = "Зарплата должна быть не меньше 0")
    @Column(name = "salary")
    private int salary;

    public User() {}

    public User(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
