//package efs.task.reflection.model;

/**
 * TODO Dodaj w odpowiednich miejscach adnotacje utworzone w pakiecie
 * <code>efs.task.reflection.annotations</code>
 * <p>
 * UWAGA: Zmiany w tym pliku powinny ograniczać się jedynie do dodania niezbędnych adnotacji
 * opisanych w ramach instrukcji do zadania.
 */
public class Villager implements Fighter {

    public static final String HIDDEN_VILLAGER_NAME = "Anonymous";
    public static final String HIDDEN_VILLAGER_DESC = "Hidden from the world, can hack anything that uses electricity";


    @MyNotNull //@NotNull
    private final String name;

    @MyNotNull //@NotNull
    private final String description;

    private Integer age;

    int health;

    private Villager() {
        this(HIDDEN_VILLAGER_NAME, HIDDEN_VILLAGER_DESC);
    }

    private Villager(Integer age , String name) {
        this(name, HIDDEN_VILLAGER_DESC);
        this.age = age;
    }

    private Villager(String name, Integer age) {
        this(name, HIDDEN_VILLAGER_DESC);
        this.age = age;
    }

    @MyBuilderProperty(name="init")
    public Villager(@MyNotNull final String name, @MyNotNull final String description) {
        this.name = name;
        this.description = description;
    }

    @MyBuilderProperty(name="health")
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Villager{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", health=" + health +
                '}';
    }
}
