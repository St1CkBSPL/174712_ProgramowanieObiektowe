import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var student = new Student("Maciej",4.2,2003);
        var student2 = new Student("Michał",4.7,2004);
        ArrayList<Student> studenci = new ArrayList<>();
        studenci.add(student);
        studenci.add(student2);

        studenci.sort(null);
        System.out.println(studenci);

        Car car1 = new Car("Renault",200000,2003);
        Car car2 = new Car("Opel",207000,2011);
        Car car3 = new Car("Ferrari",10,2025);
        Car car4 = new Car("Lighting McQueen",10000,2005);

        Car[] lista = {car1,car2,car3,car4};
        Arrays.sort(lista);
        for(var i:lista){
            System.out.println(i);
        }


    }
}
//zad1
class Student implements Comparable<Student>
{
    public String name;
    public double averageGrade;
    public int yearOfBirth;

    Student(String name, double averageGrade, int yearOfBirth)
    {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }


    @Override
    public int compareTo(Student other) {
        return Double.compare(this.averageGrade, other.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
//zad7
class Car implements Comparable<Car>{
    public String name;
    public int mileage;
    public int yearOfProduction;

    public Car(String name, int mileage, int yearOfProduction) {
        this.name = name;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car o) {
        if(this.mileage < o.mileage) return -1;
        if(this.mileage > o.mileage) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
