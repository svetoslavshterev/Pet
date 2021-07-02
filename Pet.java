import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pet
{
    final String name;

    public Pet(String name)
    {
        this.name = name;
    }
}

public class Person
{

    private String _name;
    private int _age;
    private List<Pet> _pets;

    public Person(String name, int age, List<Pet> pets)
    {
        _name = name;
        _age = age;
        _pets = pets;
    }

    public String getName()
    {
        return _name;
    }

    public int getAge()
    {
        return _age;
    }

    public Pet getFirstPet()
    {
        return _pets.get(0);
    }

    public static void entrustPet(Person giver, Person recipient, Pet pet)
    {
        if (giver._pets.contains(pet))
        {
            recipient._pets.add(pet);
            giver._pets.remove(pet);
        }
    }
}

public class Group
{

    private Map<String, Person> _members;

    public Group()
    {
        _members = new HashMap<String, Person>();
    }

    public void add(Person person)
    {
        assert person.getAge() < 18 : "No adults allowed";
        _members.put(person.getName(), person);
    }

    public Person get(String name)
    {
        return _members.get(name);
    }
}

public class Main
{
    public static void main(String[] args)
    {

        // Wir, die Hauptpersonen...
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Herr Nilsson"));
        pets.add(new Pet("Kleiner Onkel"));
        Person pippi = new Person("Pippi", 9, pets);
        Person annika = new Person("Annika", 10, new ArrayList<Pet>());
        Person tommy = new Person("Tommy", 8, new ArrayList<Pet>());

        // ...sind dick befreundet
        Group friends = new Group();
        friends.add(pippi);
        friends.add(annika);
        friends.add(tommy);
        // Ich möchte meinen Vater - berühmter Inselkönig der Südsee -
        // besuchen und vertraue meine Tiere daher meinen Freund*innen an,
        // Herrn Nilsson an Annika, den Kleinen Onkel an Tom
        Person.entrustPet(pippi, annika, pippi.getFirstPet());
        Person.entrustPet(pippi, tommy, pippi.getFirstPet());

        // Jetzt ist alles in schwedischer Smør-Butter:
        System.out.println(annika.getName() + " kümmert sich nun um "
                + annika.getFirstPet().name);
        System.out.println(tommy.getName() + " kümmert sich nun um "
                + tommy.getFirstPet().name);
    }
}