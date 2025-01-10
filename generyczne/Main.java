public class Main {
    public static void main(String[] args) {

        Dog[] dogs = {
                new Dog(3),
                new Dog(5),
                new Dog(10),
                new Dog(2),
        };

        Pair<Animal> result = new Pair<>();
        AnimalUtils.findMinMaxAge(dogs, result);

        Dog minDog = (Dog) result.getFirst();
        Dog maxDog = (Dog) result.getSecond();

        System.out.println("Najmłodszy pies ma: " + minDog.getAge() + " lat.");
        System.out.println("Najstarszy pies ma: " + maxDog.getAge() + " lat.");
    }
}
class Animal{

}

class Dog extends Animal{
    private int age;

    public Dog(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class AnimalUtils{
    public static void findMinMaxAge(Dog[] dogs, Pair<? super Dog> result){
        if(dogs == null || dogs.length == 0){
            throw new IllegalArgumentException("Nie działa weyoooo weyooooooo");
        }

        Dog minDog = dogs[0];
        Dog maxDog = dogs[0];

        for(Dog dog : dogs){
            if(dog.getAge() < minDog.getAge()){
                minDog = dog;
            }
            if(dog.getAge() > maxDog.getAge()){
                maxDog = dog;
            }
        }

        result.setFirst(minDog);
        result.setSecond(maxDog);
    }
}

class Pair<T>{
    private T first;
    private T second;

    public Pair(){}

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public void setFirst(T first){
        this.first = first;
    }
    public void setSecond(T second){
        this.second = second;
    }
}
