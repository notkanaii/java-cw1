package comp1721.cwk1;
import java.time.*;
import java.util.*;


public class CovidDataset {
    // Implement program for full solution here
    int n = 0;
    private LinkedList<CaseRecord> list1 = new LinkedList<>();
    public CovidDataset() {}
    public void readDailyCases(String filename) {

    }

    public Integer size() {
        return this.list1.size();
    }
    public void addRecord(CaseRecord rec) {
        list1.add(rec);
    }
    public CaseRecord getRecord(int index) {
        try{
        return list1.get(index);
        }catch(IndexOutOfBoundsException e){
            throw new DatasetException("The supplied index is not valid. ");
        }
    }

    public CaseRecord dailyCasesOn(LocalDate day) {
        LocalDate d;
        for (CaseRecord c:list1){
            d = c.getDate();
            if (d == day ){
                return c;
            }
        }
        throw new DatasetException("No record found. ");
    }
    public void writeActiveCases(String filename) {

    }

    public static void main(String[] args) {

    }
}