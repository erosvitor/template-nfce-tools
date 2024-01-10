package com.ctseducare.nfcetools.utils;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;

public class XmlUtils {

  public static <T> T xmlStringToXmlObject(final String xml, final Class<T> clazz) {
    Unmarshaller unmarshaller = null;
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{clazz});
      unmarshaller = jaxbContext.createUnmarshaller();
      return (T) JAXBIntrospector.getValue(unmarshaller.unmarshal(new StringReader(xml)));
    } catch (Exception var4) {
      throw new RuntimeException(var4);
    }
  }

}
