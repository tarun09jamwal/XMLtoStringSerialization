package XMLTask;

import XMLTask.food;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Serialization {
    @Test
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String readContent = new String(Files.readAllBytes(Paths.get("src/test/java/XMLTask/Data.xml")));
        food deserializedData = xmlMapper.readValue(readContent, food.class);
        System.out.println("Serialized data: ");
        System.out.println("\tName: " + deserializedData.getName());
        System.out.println("\tPrice: " + deserializedData.getPrice());
        System.out.println("\tDescription: " + deserializedData.getDescription());
        System.out.println("\tCalories: " + deserializedData.getCalories());
    }
}




