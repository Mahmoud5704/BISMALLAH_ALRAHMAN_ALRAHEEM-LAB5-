package backend;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TableLoader {

    // loads any list of students into a given DefaultTableModel
    public static void loadStudents(DefaultTableModel model, List<StudentModule> students) {
        model.setRowCount(0); // clear old rows
        for (StudentModule s : students) {
            Object[] row = {
                s.getId(),
                s.getName(),
                s.getDepartment(),
                s.getGpa(),
                s.getAge(),
                s.getGender()
            };
            model.addRow(row);
        }
    }
}