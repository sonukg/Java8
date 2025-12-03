package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LEComparator {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 20));
        personList.add(new Person("Mary", 25));
        personList.add(new Person("Peter", 30));
        personList.add(new Person("Anna", 28));
        personList.add(new Person("Paul", 35));

        //without lambda expression
        //sort by age
        Comparator<Person> comparator =new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(personList, comparator);
        System.out.println("Sort Person List by age in ascending order:");
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        //with lambda expression
        Collections.sort(personList, (o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println("Sort Person List by age in ascending order:");
        personList.forEach(
                (person -> System.out.println(person.getName() + " " + person.getAge()))
        );

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
