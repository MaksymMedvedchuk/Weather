package logic;

import model.ObjectFactory;
import model.Year;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class UnmarshalYear {
    public static void main(String[] args) {

        JAXBContext jaxbContext;
        {
            try {
                jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                Year year = ((JAXBElement<Year>) unmarshaller.
                        unmarshal(new FileInputStream("C:\\Users\\po1ak\\IdeaProjects\\Weather\\src\\main\\resources\\schema.xml"))).getValue();
                System.out.println(year);
            } catch (JAXBException | FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
