package util;

import model.ObjectFactory;
import model.Year;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class YearUnmarshaller {

    public Year getInfoFromXml() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            validateXmlFile(unmarshaller);
            return ((JAXBElement<Year>) unmarshaller.unmarshal(new File(PropertyReader.getKey(PropertyKey.PATH_TO_XML.getKey())))).getValue();
        } catch (JAXBException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    private void validateXmlFile(Unmarshaller unmarshaller) throws SAXException {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema xsdFile = schemaFactory.newSchema(new File(PropertyReader.getKey(PropertyKey.PATH_TO_XSD.getKey())));
        unmarshaller.setSchema(xsdFile);
    }
}


