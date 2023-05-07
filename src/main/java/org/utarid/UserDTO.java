package org.utarid;

public class UserDTO {
    public int age;
    public String name;

    @Override
    public String toString() {
        return "UserDTO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
