/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author AhmetALBAYRAK
 */
@Entity
@Table(name = "EMPLOYEE2")
public class Employee implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "SURNAME", nullable = false)
    private String surname;
    @Column(name = "SALARY", nullable = false)
    private int salary;

    @OneToOne //burda 1-1 ilişki olduğunu
    @JoinColumn(name = "DEPARTMENT_ID", nullable = false)//burda bu kolonun başka tabloylqa bağlantılı olduğunu tanımladık
    private Department departmentId;//baplantısınıda Department sınıfndan anlıyor

    public Employee() {
    }

    public Employee(int id, String name, String surname, int salary, Department departmentId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "" + id + " " + name + " " + surname + " " + " " + salary + " TL " + departmentId;
    }
}
