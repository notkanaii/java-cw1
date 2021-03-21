package comp1721.cwk1;
import java.time.*;
import java.util.*;

public class CaseRecord {
    private LocalDate date;
    private int staffCases;
    private int studentCases;
    private int otherCases;

    public CaseRecord(LocalDate date, int staffCases, int studentCases, int otherCases) {
        if(staffCases<0|| studentCases<0||otherCases<0){
            throw new DatasetException("The number of cases is negative");
        }
        this.date = date;
        this.staffCases = staffCases;
        this.studentCases = studentCases;
        this.otherCases = otherCases;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getStaffCases() {
        return staffCases;
    }

    public int getStudentCases() {
        return studentCases;
    }

    public int getOtherCases() {
        return otherCases;
    }

    public int totalCases() {
        int a =staffCases + studentCases + otherCases;
        return a;
    }

    public String toString() {
        String s = date + ": "+ staffCases + " staff, "+ studentCases + " students, "+otherCases+" other";
        return s;
    }

    public static void main(String[] args) {

    }

}