package hrc.bl;

import java.util.Date;

public class Person {
    private String name;
    private Sex sex;
    private Date birthday;

    public Person(String aName, Sex aSex, Date aBirthday) {
        this.name = aName;
        this.sex = aSex;
        this.birthday = aBirthday;
    }
}
