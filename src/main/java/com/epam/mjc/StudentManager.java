package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) throws StudentNotFoundException {
        Student student = null;
        if (studentID == 1 || studentID == 2 || studentID == 3 || studentID == 4
                || studentID == 5 || studentID == 6 || studentID == 7 || studentID == 8 || studentID == 9 ||
                studentID == 10 || studentID == 11) {
            student = Student.getValueOf(studentID);
        } else {
            throw new StudentNotFoundException(String.format("Could not find student with ID %s", studentID));
        }

        return student;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        try {
            for (int i = 0; i < IDs.length; i++) {
                Student student = manager.find(IDs[i]);
                System.out.println("Student name " + student.getName());
            }
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }

    }
}