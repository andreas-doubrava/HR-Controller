package hrc;

import hrc.bl.Person;
import hrc.bl.Sex;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        String sDate = "12.10.1977";
        try {
            Person p = new Person("Andreas", Sex.MALE, new SimpleDateFormat("dd.MM.yyyy").parse(sDate));
        }
        catch (ParseException e) {
        }

    }
}