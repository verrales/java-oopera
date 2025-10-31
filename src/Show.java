import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addNewActor(Actor newActor) {
        for (Actor existingActor : listOfActors) {
            if (existingActor.equals((newActor))) {
                System.out.println("Актёр '" + newActor.getName() + " " + newActor.getSurname() + "' уже участвует в спектакле!");
                return;
            }
        }

        listOfActors.add(newActor);
    }

    public void replaceActor (Actor newActor, String surname) {
        boolean found = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);

            if (currentActor.getSurname().equals(surname)) {
                Actor oldActor = listOfActors.set(i, newActor);

                System.out.println("Актёр '" + oldActor.getSurname() + "' заменён на '" + newActor.getSurname() + "'.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Актёр '" + surname + "' не найден.");
        }
    }
}
