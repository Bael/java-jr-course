package com.github.bael.course.unit2.examples.encapsulation.ex;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PatientExTest {

    @Test
    public void testGetters() {
        // ARRANGE
        LocalDateTime dateOfTreatment = LocalDateTime.of(2019, 8, 8, 10, 0, 0);
        // не пишем 0 перед цифрами - это восьмеричная система исчисления в java/ LocalDateTime.of(2019, 08, 08, 10, 0, 0)
        TreatmentEx treatmentEx = new TreatmentEx(dateOfTreatment, "glucose", 100);
        List<TreatmentEx> treatmentExesCourse = new ArrayList<>();
        treatmentExesCourse.add(treatmentEx);
        PatientEx patientEx = new PatientEx("Bruce Wayne", "Arkham #6", treatmentExesCourse);

        // ACT
        List<TreatmentEx> course = patientEx.getCourse();
        System.out.println("План лечения был такой: " + course);
        course.clear();
        System.out.println("А стал пустой: "+ course);

        patientEx.treat();
        // ASSERT
        assertTrue(patientEx.isCured());
    }


    @Test(expected = UnsupportedOperationException.class)
    public void testGettersUnmodified() {
        // ARRANGE
        LocalDateTime dateOfTreatment = LocalDateTime.of(2019, 8, 8, 10, 0, 0);
        // не пишем 0 перед цифрами - это восьмеричная система исчисления в java/ LocalDateTime.of(2019, 08, 08, 10, 0, 0)
        TreatmentEx treatmentEx = new TreatmentEx(dateOfTreatment, "glucose", 100);
        List<TreatmentEx> treatmentExesCourse = new ArrayList<>();
        treatmentExesCourse.add(treatmentEx);
        PatientEx patientEx = new PatientEx("Bruce Wayne", "Arkham #6", treatmentExesCourse);

        // ACT
        List<TreatmentEx> course = patientEx.getCourseUnmodifiedable();
        System.out.println("План лечения был такой: " + course);
        course.clear();
        System.out.println("А стал пустой: "+ course);

        patientEx.treat();
        // ASSERT
        assertTrue(patientEx.isCured());
    }
}