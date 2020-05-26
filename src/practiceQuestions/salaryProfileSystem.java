package practiceQuestions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class salaryProfileSystem {
    String employeeName;
    int month;
    int salary;
    int id = 1;

    public salaryProfileSystem(String employeeName, int month, int salary){
        this.employeeName = employeeName;
        this.month = month;
        this.salary = salary;
    }

    public String salaryRecords() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String record = this.id + "_" + this.employeeName
                + "_" + this.month + "_" + this.salary + "_" + formatter;
        id += 1;
        return record;
    }

}
