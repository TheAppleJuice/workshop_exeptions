package se.lexicon.exceptions.workshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;

public class Main {

	public static void main(String[] args) {

        List <String> maleFirstNames = null;
        try {
            maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

        List <String> lastNames = null;
        try {
            lastNames = CSVReader_Writer.getLastNames();
        } catch (IOException e) {
            e.printStackTrace();
        }


        NameService nameService = new NameService(maleFirstNames, femaleFirstNames,lastNames);

        //nameService.addFemaleFirstName("Molly");
        //nameService.addMaleFirstName("Isak");

        //nameService.addFemaleFirstName("Ruxandra");
        //nameService.addMaleFirstName("Sebastian");

        Person test = nameService.getNewRandomPerson();
        List <Person> personList = new ArrayList<>();
        personList.add(test);
        System.out.println(test);

	}

}
