import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name,
                 String surname,
                 Gender gender,
                 int height) {

        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", (" + height + " см.)}";
    }

    @Override
    public boolean equals(Object o) {
        Actor actor = (Actor) o;
        return super.equals(o) && height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

}
