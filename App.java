import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class App {
     public static void main(String[] args) throws IOException 
     {
        PeopleReader reader = new PeopleReader("people.txt");
        List<Person> people = reader.getAllPeople();
        
       // public static HashMap<String, List<Person>> groupByFear(List<Person> people) {
        HashMap<String, List<Person>> groupByFear = new HashMap<>();
        
        for(Person p : people){
            if(groupByFear.containsKey(p.getFear())){
                List<Person>peopleWithThisFear = groupByFear.get(p.getFear());
                peopleWithThisFear.add(p);
            }
            else{
                ArrayList<Person> fearGroup = new ArrayList<>();
                fearGroup.add(p);
                groupByFear.put(p.getFear(), fearGroup);
             }
             
        }
            
        for(String fear : groupByFear.keySet()){
            System.out.println("------------------------------");
            System.out.println(fear);

            List<Person> peopleWithThisFear = groupByFear.get(fear);
            for(Person p1 : peopleWithThisFear){
                System.out.println("\t" + p1.toString());
            }
            System.out.println("-------------------------------");
                
            
            }
           // return allFears;

        //for (Person p : people) {
        //    System.out.println(p);
    }
    
  }

    

     
     
        


