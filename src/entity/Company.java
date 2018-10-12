package entity;

import java.util.ArrayList;
import java.util.List;

public class Company {

    String name ;
    List<Emp> emps =new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
}
