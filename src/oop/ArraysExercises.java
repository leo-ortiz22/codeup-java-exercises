package oop;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {



        Person[] persons;

        persons = new Person[3];
        persons [0] = new Person("Leo");
        persons [1] = new Person("Kat");
        persons [2] = new Person("Bubba");

        for(Person person: persons){
            person.sayHello();
        }




//        Person[] newPersonArray;
//        Person Steven = new Person("Steven");
//        Person[] newnewPersonArray = ArraysExercises.addPerson(new Person("steven"),persons);
//          for (Person persons )
        }
//    }
    public static Person[] addPerson(Person[] arr, Person person) {
        Person[] newPeople = Arrays.copyOf(arr, arr.length + 1);
        newPeople[newPeople.length - 1] = person;
        return newPeople;
    }
}