import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person Leo = new Person("Leo");
        Person Kat = new Person("Kat");
        Person Bubba = new Person("Bubba");
        Person[] people = {Leo, Kat, Bubba};




        Person Steven = new Person("Steven");
        Person[] newPeople = addPerson(people, Steven);
        for(Person person : newPeople){
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(Person[] arr, Person person) {
        Person[] newPeople = Arrays.copyOf(arr, arr.length + 1);
        newPeople[newPeople.length - 1] = person;
        return newPeople;
    }
}