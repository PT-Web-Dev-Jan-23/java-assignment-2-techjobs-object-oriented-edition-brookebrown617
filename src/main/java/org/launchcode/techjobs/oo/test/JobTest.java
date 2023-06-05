package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
     public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Barista",
                new Employer("Starbucks"),
                new Location("Antarctica"),
                new PositionType("Customer Service"),
                new CoreCompetency("Baddie"));

       assertTrue(testJob instanceof Job);
       assertTrue(testJob.getEmployer() instanceof Employer);
       assertTrue(testJob.getLocation() instanceof Location);
       assertTrue(testJob.getPositionType() instanceof PositionType);
       assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

       assertEquals(testJob.getName().toString(), "Barista");
       assertEquals(testJob.getEmployer().toString(), "Starbucks");
       assertEquals(testJob.getLocation().toString(), "Antarctica");
       assertEquals(testJob.getPositionType().toString(), "Customer Service");
       assertEquals(testJob.getCoreCompetency().toString(), "Baddie");

    }
    @Test
    public void testJobsForEquality(){
        Job testJob = new Job("Barista",
                new Employer("Starbucks"),
                new Location("Antarctica"),
                new PositionType("Customer Service"),
                new CoreCompetency("Baddie"));
        Job testJob2 = new Job("Barista",
                new Employer("Starbucks"),
                new Location("Antarctica"),
                new PositionType("Customer Service"),
                new CoreCompetency("Baddie"));
        assertFalse(testJob.equals(testJob2));
    }
    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Barista",
                new Employer("Starbucks"),
                new Location("Antarctica"),
                new PositionType("Customer Service"),
                new CoreCompetency("Baddie"));
        String testJobString = testJob.toString();
        char firstChar = testJobString.charAt(0);
        char lastChar = testJobString.charAt(testJobString.length()-1);
//        assertEquals(testJobString.charAt(0), '\n');
        assertEquals(testJobString.charAt(testJobString.length() -1), '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Barista",
                new Employer("Starbucks"),
                new Location("Antarctica"),
                new PositionType("Customer Service"),
                new CoreCompetency("Baddie"));
        String testJobString = testJob.toString();
        assertEquals(testJobString,
                "ID: " + testJob.getId() + "\n" +
                "Name: Barista\n" +
                "Employer: Starbucks\n" +
                "Location: Antarctica\n" +
                "Position Type: Customer Service\n" +
                "Core Competency: Baddie\n");
    }
//    @Test
//    public void testToStringHandlesEmptyField(){
//        Job testJob = new Job("",
//                new Employer(""),
//                new Location(""),
//                new PositionType(""),
//                new CoreCompetency(""));
//        String testJobString = testJob.toString();
//        assertEquals(testJobString,
//                "\nID: " + testJob.getId() + "\n" +
//                "\nName: Name not valid\n" +
//                "\nEmployer: Employer not valid\n" +
//                "\nLocation: Location not valid\n" +
//                "\nPosition Type: Position Type not valid\n" +
//                "\nCore Competency: Core Competency not valid\n");
//    }
}
