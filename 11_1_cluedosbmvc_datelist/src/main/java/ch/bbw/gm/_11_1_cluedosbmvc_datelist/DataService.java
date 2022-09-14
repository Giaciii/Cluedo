package ch.bbw.gm._11_1_cluedosbmvc_datelist;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Giacun
 * @version 07.09.2022
 */
@Service
public class DataService {

    private List<Person> persons = List.of(
            new Person("Mustard", "Colonel", "Schwarz", 65, 1.80, "Militär"),
            new Person("Plum", "Professor", "Grau", 70, 1.70, "Brille, Schnauz"),
            new Person("Scarlett", "Miss", "Blond", 24,1.65, "Rotes Kleid"),
            new Person("Green", "Reverend", "Grau", 50, 1.85, "Glatze"),
            new Person("White", "Mrs", "Grau", 55, 1.60, "Kochschürze"),
            new Person("Peacock", "Mrs", "Grau", 67, 1.70, "Krone")
    );

    private List<Weapon> weapons = List.of(
            new Weapon("Dolch", "Stahl", 25, 450),
            new Weapon("Kerzenleuchter", "Eisen", 30, 1000),
            new Weapon("Bleirohr", "Blei", 50, 2500),
            new Weapon("Seil", "Stroh", 2500, 80),
            new Weapon("Rohrzange", "Eisen", 30, 1000),
            new Weapon("Revolver", "Stahl", 26, 400)
    );

    private List<Room> rooms = List.of(
            new Room("Eingangshalle", 20, 3, 2, "Karo", "Dunkel"),
            new Room("Wintergarten", 30, 1, 5, "Karo", "Sehr hell"),
            new Room("Wohnzimmer", 50, 1, 5, "Holzlinien", "Sehr hell"),
            new Room("Esszimmer", 30, 1, 4, "Holzlinien", "Mittel dunkel"),
            new Room("Küche", 25, 1, 2, "Quadrate", "Hell")
    );

    public List<Person> getPersons() {
        return persons;
    }
    public List<Weapon> getWeapons() {
        return weapons;
    }
    public List<Room> getRooms() { return rooms; }
}
