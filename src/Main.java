public class Main {
    public static void main(String[] args) throws IllegalStateException, IllegalArgumentException {
        Person mom = new PersonBuilder()
                .withName("Anna")
                .withSurname("Wolf")
                .withAge(32)
                .withResidention("Sydney")
                .build();

        Person son = mom.newChildBuilder()
                .withName("Antony")
                .build();

        System.out.println("У " + mom + "\n есть сын: " + son);

        try {
            Person dad = new PersonBuilder()
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();

        }

        try {
            Person person = new PersonBuilder()
                    .withAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
