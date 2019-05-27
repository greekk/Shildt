public class course {
    public static void main(String[] args) {
        Human human = new Human("Sasha", "Grich", "Vlad", "14/07/1980");
        Human human1 = new Human("Sasha", "Grich", "Vlad", "14/07/1980");
        Human human2 = new Human();

        human2.setName("Bob");
        human2.setSurname("Smith");
        human2.setDate_of_birth("15/02/1976");

        Human human3 = new Human()
                .withDateOfBirth("04/12/1975")
                .withMiddlename("Petrovich")
                .withName("Alexey")
                .withSurname("Petrov");

        System.out.println(human.equals(human2));
        System.out.println(human.equals(human1));
        System.out.println(human3);

        System.out.println(human.getClass());

        Human cop = new Cop()
                .withRank(5);
        System.out.println(cop);
        System.out.println(cop.getClass());
    }
}
