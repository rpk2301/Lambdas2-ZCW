public class CheckPersonConcrete implements CheckPerson{
    @Override
    public boolean test(Person p) {

        //check for age && gender
        return (p.getAge() != -1 || p.getGender()!=null);
    }

//printing(listOfPeople,Person p) -> p.getGender() == Person.Sex.Male);

}
