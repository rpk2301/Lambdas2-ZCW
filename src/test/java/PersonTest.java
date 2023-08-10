import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
   public void getAge() {

        Person p = new Person();
        p.setBirthday(2013, Month.APRIL,24);
        int expected = 10;
        int actual = p.getAge();

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void GenderTest()
    {
        Person p = new Person();
        p.setGender(Person.Sex.FEMALE);
        Person.Sex expected = Person.Sex.FEMALE;
        Person.Sex actual = p.getGender();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkPersonWithLocalClass()
    {
        List<Person> listofpeople = new ArrayList<>();
        listofpeople.add(new Person("Joe Huntenberg", LocalDate.of(2010,Month.APRIL,24),
                Person.Sex.MALE,"HiImJoe@aol.com"));
        String expected = "Joe Huntenberg is 13 yeards old. They are a MALE. Find them at HiImJoe@aol.com";
        Assert.assertEquals(expected,listofpeople.get(0).printPerson());
    }
}