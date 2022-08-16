public class Person {

    protected String name;
    protected String surname;
    protected Integer age;
    protected String residention = "Не указано";

    public Person() {

    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String residention) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.residention = residention;
    }

    public boolean hasAge() {
        if (age != null) {
            return true;
        }
        return false;
    }

    public boolean hasResidention() {
        if (residention.equals(null)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getResidention() {
        return residention;
    }

    public void setResidention() {
        this.residention = residention;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "Имя: " + name + "\n" +
                "Фамилия: " + surname + "\n" +
                "Возраст: " + age + "\n" +
                "Место жительства: " + residention + "\n" +
                "}";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + age + residention.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder childrenBuilder = new PersonBuilder()
                .withSurname(this.surname)
                .withAge(0);
        return childrenBuilder;
    }
}
