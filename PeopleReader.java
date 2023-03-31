import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PeopleReader {
    private final String filename;

    public PeopleReader(String filename) {
        this.filename = filename;
    }

    public List<Person> getAllPeople() throws IOException {
        List<Person> people = new ArrayList<>();

        List<String> lines = Files.readAllLines(Path.of(filename));
        for (String line : lines) {
             String [] lStrings = line.split(" ");
             String firstName = lStrings[0];
             String lastName = "";
             String middleName = "";
             String ageString = null;
             int age = 0;
             
             if(Character.isDigit(lStrings[2].charAt(0))){
                lastName = lStrings[1];
                age = Integer.parseInt(lStrings[2]);
                ageString = lStrings[2];
             }
              else {
                lastName = lStrings[2];
                middleName = lStrings[1];
                age = Integer.parseInt(lStrings[3]);
                ageString = lStrings[3];

             }
             String fears = line.substring(line.indexOf(ageString) + ageString.length() + 1);
             people.add(new Person(firstName, middleName, lastName, age, fears));
            
            }
             return people;
    }
}