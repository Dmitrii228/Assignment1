package models;

import java.util.ArrayList;

import javafx.scene.image.Image;
/**
 * Name: Dmitrii Demin
 * Date:08.02.2021
 */
public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private String interests;
    private Image myImage;


    public Student(String firstName, String lastName, int studentNumber, String interests) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterests(interests);
        setMyImage();
    }

    /**
     * Set the image path to be able to show the image
     */
    public void setMyImage(){
        String filePath = "image/pictureForJava.jpg";
        myImage = new Image(filePath);
    }
    public Image getMyImage(){
        return myImage;
    }

    public String getFirstName() {

        return this.firstName;
    }

    /**
     * Setter of the first name that validates the first name to be at least 2 characters and contains letters or space
     * Sets the first letters of the name to be upper case
     * if no than throw illegal argument exception
     * @param firstName
     */
    public void setFirstName(String firstName) {

        if ( firstName.length()>=2) {
            if (firstName.toLowerCase().matches("[a-z]*"))
                this.firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
            else
                throw new IllegalArgumentException("Fist name should contain only letters or a space");
        }
        else
        {
            throw new IllegalArgumentException("Fist name should be at least two characters!");
        }
    }

    public String getLastName() {

        return this.lastName;
    }
    /**
     * Setter of the last name that validates the last name to be at least 2 characters and contains letters or space
     * Sets the last letters of the name to be upper case
     * if no than throw illegal argument exception
     * @param lastName
     */
    public void setLastName(String lastName) {


        if ( lastName.length()>=2) {
            if(lastName.toLowerCase().matches("[a-z]*"))
                this.lastName = lastName.substring(0,1).toUpperCase()+firstName.substring(1);
            else
                throw new IllegalArgumentException("Last name should contain only letters or a space");
        }
        else
        {
            throw new IllegalArgumentException("Fist name should be at least two characters!");
        }
    }


    public int getStudentNumber() {

        return this.studentNumber;
    }

    /**
     * Setter of the student number that validates the number is between 100000000 and 999999999
     * if no than throw illegal argument exception
     * @param studentNumber
     */
    public void setStudentNumber(int studentNumber) {

        if ( studentNumber >= 100000000 && studentNumber<= 999999999){
            this.studentNumber = studentNumber;
        }
        else {
            throw new IllegalArgumentException("The student number should be between 100000000 and 999999999");
        }
    }

    public  ArrayList<String> getInterest() {

        return addActivities(interests);
    }

    /**
     * checks if the passed interest is an empty string if no adds the interest to an array of strings
     * @param interests
     * @return
     */
    public static ArrayList<String> addActivities(String interests){
        ArrayList<String> arrayOfInterests = new ArrayList<String>();
        if(interests.equals("")){
            throw new IllegalArgumentException("Interest should not be empty");
        }
        else
           arrayOfInterests.add(interests);
        return arrayOfInterests;

    }
    public void setInterests(String interests) {

           this.interests = interests;

    }
}
