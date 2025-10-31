import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor firstActor = new Actor("Ольга", "Миронова", Gender.FEMALE, 154);
        Actor secondActor = new Actor("Михаил", "Миронов", Gender.MALE, 163);
        Actor thirdActor = new Actor("Олег", "Газманов", Gender.MALE, 185);

        Director firstDirector = new Director("Ира", "Калинова", Gender.FEMALE, 15);
        Director secondDirector = new Director("Дмитрий", "Акустиков", Gender.MALE, 42);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Ксения Никулина";

        ArrayList<Actor> regularActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();

        Show regularShow = new Show("Идиот", 120, secondDirector, regularActors);
        Opera operaShow = new Opera("Идиот", 120, secondDirector, operaActors, musicAuthor, "Либретто оперы", 20);
        Ballet balletShow = new Ballet("Идиот", 120, secondDirector, balletActors, musicAuthor, "Либретто баллета", choreographer);

        regularShow.addNewActor(firstActor);
        regularShow.addNewActor(thirdActor);

        operaShow.addNewActor(secondActor);
        operaShow.addNewActor(thirdActor);

        balletShow.addNewActor(firstActor);
        balletShow.addNewActor(thirdActor);

        System.out.println("Список актёров обычного шоу:");
        regularShow.printListOfActors();

        System.out.println("Список актёров оперы:");
        operaShow.printListOfActors();

        System.out.println("Список актёров баллета:");
        balletShow.printListOfActors();

        regularShow.replaceActor(secondActor, "Газманов");
        System.out.println("Обновлённый список актёров обычного шоу:");
        regularShow.printListOfActors();

        operaShow.replaceActor(firstActor, "Оксимирон");

        System.out.println("Либретто оперы:");
        System.out.println(operaShow.librettoText);
        System.out.println("Либретто баллета:");
        System.out.println(balletShow.librettoText);
    }
}
