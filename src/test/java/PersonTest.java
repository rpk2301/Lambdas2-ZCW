import org.junit.Assert;
import org.junit.Test;

import java.time.Month;

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
}