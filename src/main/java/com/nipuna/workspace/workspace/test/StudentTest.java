package com.nipuna.workspace.workspace.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class StudentTest {
    public static void main(String args[]) throws Exception {
        Student student = new Student();
        student.setName("bhanu");
        student.setStudentId(20);


        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter xmlWriter = new StringWriter();
        marshaller.marshal(student, xmlWriter);
        System.out.println(xmlWriter.toString());
    }
}

/**
 * <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
 * <student student_id="20">
 *     <name>bhanu</name>
 * </student>
 */
