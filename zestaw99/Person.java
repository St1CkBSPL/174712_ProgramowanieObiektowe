public record Person(String firstName, String lastName, int age, Address address) {
    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

        if(age < 0)
            this.age = 0;
        else
            this.age = age;
    }
}
