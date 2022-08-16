public class PersonBuilder implements Builder {

    private Person newPerson = new Person();

    public PersonBuilder withName(String name) {
        // Удостоверимся в том, что имя не было указано ранее
        if (newPerson.name.equals(null)) {
            this.newPerson.name = name;
            return this;
        }
        System.out.println("Вы уже указали имя, оно не может быть изменено");
        return  this;
    }

    public PersonBuilder withSurname(String surname) {
        // Удостоверимся в том, что фамилия не была указана ранее
        if (newPerson.surname.equals(null)) {
            newPerson.surname = surname;
            return this;
        }
        System.out.println("Вы уже указали фамилию, она не может быть изменена");
        return this;
    }

    public PersonBuilder withAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Вы указали некорректный возраст");
        }
        // Удостоверимся в том, что возраст не был указан раньше,
        // в противном случае он может меняться только happyBirthday
        if (newPerson.age.equals(null)) {
            newPerson.age = age;
            return this;
        }
        System.out.println("Вы уже указали возраст, теперь он может быть изменен только методом happyBirthday");
        return this;
    }

    public PersonBuilder withResidention(String residention) {
        newPerson.residention = residention;
        return this;
    }

    @Override
    public Person build() throws IllegalStateException {
        if (newPerson.name.equals(null) || newPerson.surname.equals(null)) {
            throw new IllegalStateException("Вы не ввели Имя или Фамилию человека");
        }
        return newPerson;
    }
}
