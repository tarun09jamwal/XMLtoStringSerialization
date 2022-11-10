package ObjectOfObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Testt
{
    @Test
    public static void ObjOfObj() throws IOException
    {
        byte[] json = Files.readAllBytes(Paths.get("src/test/java/ObjectOfObject/Data.json"));
        ObjectMapper mapper = new ObjectMapper();

        Person person = mapper.readValue(json, Person.class);
        System.out.println("My email is: " + person.getEmail());
        System.out.println("My first name is: " + person.getFirstname());
        System.out.println("My last name is: " + person.getLastname());
        System.out.println("I am from: " + person.getAddress().getState());
        System.out.println("My country is: " + person.getAddress().getCountry());
        System.out.println("My district is: " + person.getAddress().getDistAndPin().getDistrict());
        System.out.println("Pin code of mandi is: " + person.getAddress().getDistAndPin().getPin());
    }

    public static void main(String[] args) throws IOException
    {
        ObjOfObj();
    }
}
