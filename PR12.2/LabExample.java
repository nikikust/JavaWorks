import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SearchStudent extends Throwable {
    public SearchStudent(String s) {}

    public String search(SortingStudentsByGPA[] students, String search) throws SearchStudent{
        for (SortingStudentsByGPA student: students){
            if (student.name.equals(search)){
                return "Found";
            }
        }
        throw new SearchStudent("Not found");
    }

}

class LabExample extends JFrame
{
    static JButton buttonSort = new JButton("Sort");
    static JButton buttonSearch = new JButton("Search");

    static JTextField fieldSearch = new JTextField(15);
    static JLabel txt = new JLabel("(Type for search)");

    static SortingStudentsByGPA[] students = new SortingStudentsByGPA[] {
            new SortingStudentsByGPA("name1", 45),
            new SortingStudentsByGPA("name2", 12),
            new SortingStudentsByGPA("name3", 32),
            new SortingStudentsByGPA("name4", 112),
            new SortingStudentsByGPA("name5", 426),
            new SortingStudentsByGPA("name6", 23),
            new SortingStudentsByGPA("name7", 52),
            new SortingStudentsByGPA("name8", 235),
            new SortingStudentsByGPA("name9", 123),
            new SortingStudentsByGPA("name10", 1356),
            new SortingStudentsByGPA("name11", 1),
            new SortingStudentsByGPA("name12", 12345),
            new SortingStudentsByGPA("name13", 0)
    };

    static JTextArea names = new JTextArea("");

    public LabExample()
    {
        super("Buttonssssss!");
        setSize(300,300);

        setLayout(new FlowLayout());
        add(buttonSort);
        add(buttonSearch);

        buttonSort.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                SortingStudentsByGPA.quickSort(students, 0, students.length - 1);

                names.setText("");
                for (int i = 0; i < students.length; i++) {
                    names.setText(names.getText() + students[i] + "\n");
                }
            }
        });

        buttonSearch.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
                    SearchStudent searching = new SearchStudent("");
                    txt.setText(searching.search(students, fieldSearch.getText()));
                }
                catch (SearchStudent err)
                {
                    txt.setText("Not found");
                }
            }
        });

        add(fieldSearch);
        add(txt);
        add(names);


        setVisible(true);
    }
    public static void main(String[]args)
    {
        names.setText("");
        for (int i = 0; i < students.length; i++) {
            names.setText(names.getText() + students[i] + "\n");
        }

        new LabExample();
    }
}