package ch.bbw.gm._11_1_cluedosbmvc_datelist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<Person> getPersons() {
        return persons;
    }
}
