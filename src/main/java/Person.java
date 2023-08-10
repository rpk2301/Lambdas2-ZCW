import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }
    String name;

    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person()
    {
        this("name",null,null,null);

    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress)
    {
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.birthday = birthday;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday,LocalDate.now()).getYears();
    }

    public void printPerson() {
    String output = "%s is %d yeards old. They are a %s. Find them at %s";
    String out =  String.format(output, name, getAge(),gender,emailAddress);
    System.out.println(out);

    }


    public static void printPerson(List<Person> roster, CheckPerson tester) {

        for (Person p:roster)
        {
        if(tester.test(p))
        {
            p.printPerson();
        }
        }

    }




    public void setBirthday(int year, Month month, int DayOfMonth) {
        birthday = LocalDate.of(year,month,DayOfMonth);
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender)
    {
        this.gender = gender;
    }



}