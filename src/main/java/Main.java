import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //LOOK I MADE A LAMBDA.
        CheckPerson f = t ->  t.getGender() == Person.Sex.MALE;
        //LOOK I MADE A LAMBDA.
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jeffrey", LocalDate.of(2013,10,23), Person.Sex.MALE,"Jeff@aol.com"));
        people.add(new Person("Ashley", LocalDate.now(), Person.Sex.FEMALE,"Ashley@aol.com"));
        people.add(new Person("Antonio", LocalDate.now(), Person.Sex.MALE,"Antonio@aol.com"));
        people.add(new Person("Dolio", LocalDate.now(), Person.Sex.MALE,"Dolio@aol.com"));
        people.add(new Person("Kris", LocalDate.now(), Person.Sex.MALE,"Kris@aol.com"));
        printing(people,f);
        testingLambda(() -> System.out.println("Hi Im kinda testing Lambdas.")) ;


    }
    public static void testingLambda(FunctTest1 test)
    {
    test.DoIt();
    }




    public static void printing(List<Person> people, CheckPerson test)
    {
        System.out.println();
        Person.printPerson(people,test);

    }




}
