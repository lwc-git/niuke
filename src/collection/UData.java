package collection;

import java.io.Serializable;
import java.util.Objects;

public class UData implements Comparable<UData>,Serializable{
    private String ID;
    private String Username;
    private int Age;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public UData() {

    }

    public UData(String ID, String username, int age) {

        this.ID = ID;
        Username = username;
        Age = age;
    }

    @Override
    public int compareTo(UData o) {
        if(getAge()>o.getAge()){
            return 1;
        }
        if(getAge()<o.getAge()){
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        UData o = (UData) obj;
        if(this.getAge()==o.getAge()&&this.getID()==o.getID()&&this.getUsername()==o.getUsername())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getAge())+Objects.hashCode(getID())+Objects.hashCode(getUsername());
    }
}
