package com.test.stbe;

import java.util.Objects;

public class Employee
{
    private int eid;
    private String name, address;

    public Employee(int eid, String name, String address) {
        this.eid = eid;
        this.name = name;
        this.address = address;
    }


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "com.test.stbe.Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return eid == employee.eid &&
                Objects.equals(name, employee.name) &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(eid, name, address);
    }
}
