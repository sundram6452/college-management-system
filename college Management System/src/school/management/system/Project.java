
package school.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener{
    Project(){
        setSize(1510,860);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Icons/jublee.jpg"));
        Image img2=img1.getImage().getScaledInstance(1510,800,Image.SCALE_DEFAULT );
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image=new JLabel(img1);
        add(image);
        
        JMenuBar mbar=new JMenuBar();
        JMenu newInfo=new JMenu("New Information");
        newInfo.setForeground(Color.blue);
        mbar.add(newInfo);
        
        JMenuItem faculty=new JMenuItem("New Faculty Information");
        faculty.setBackground(Color.white);
         faculty.addActionListener(this);
        newInfo.add(faculty);
         
        JMenuItem student=new JMenuItem("New Student Information");
        student.setBackground(Color.white);
        student.addActionListener(this);
        newInfo.add(student);
        
        // details
         JMenu details=new JMenu("View Information");
        details.setForeground(Color.MAGENTA);
        mbar.add(details);
        
        JMenuItem facultydetails=new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.white);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
         
        JMenuItem studentdetails=new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.white);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        // leave
         JMenu leave=new JMenu("Apply Leave");
        leave.setForeground(Color.blue);
        mbar.add(leave);
        
        JMenuItem facultyleave=new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.white);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
         
        JMenuItem studentleave=new JMenuItem("Student Leave");
        studentleave.setBackground(Color.white);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        // leave details
         JMenu leavedetails=new JMenu("Leave Details");
        leavedetails.setForeground(Color.MAGENTA);
        mbar.add(leavedetails);
        
        JMenuItem facultyleavedet=new JMenuItem("Faculty Leave Details");
        facultyleavedet.setBackground(Color.white);
        facultyleavedet.addActionListener(this);
        leavedetails.add(facultyleavedet);
         
        JMenuItem studentleavedet=new JMenuItem("Student Leave Details");
        studentleavedet.setBackground(Color.white);
        studentleavedet.addActionListener(this);
        leavedetails.add(studentleavedet);
        
        
        // exams
         JMenu exam=new JMenu("Examination");
        exam.setForeground(Color.blue);
        mbar.add(exam);
        
        
        JMenuItem marks=new JMenuItem("Enter Marks");
        marks.setBackground(Color.white);
         marks.addActionListener(this);
        exam.add(marks);
        
      
        
       
        // exit
         JMenu  exit=new JMenu("Exit");
        exit.setForeground(Color.RED);
        mbar.add(exit);
        exit.setFont(new Font("serif",Font.BOLD,20));
        
        JMenuItem  ext=new JMenuItem("Exit");
        ext.setBackground(Color.white);
        ext.addActionListener(this);
        exit.add(ext);
        
        
        
        setJMenuBar(mbar);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String mesg=ae.getActionCommand();
        if(mesg.equals("Exit")){
            setVisible(false);
        }
      
       
        else if (mesg.equals("New Faculty Information")) {
            new addTeacher();
        } else if (mesg.equals("New Student Information")) {
            new addStudent();
        }
         else if (mesg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (mesg.equals("View Student Details")) {
            new studentDetails();
        } else if (mesg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (mesg.equals("Student Leave")) {
            new StudentLeave();
        }
        else if (mesg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (mesg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        }
       
          else if (mesg.equals("Enter Marks")) {
            new EnterMarks();
        }
         
    }
    public static void main(String[]args){
        new Project();
    }
    
}
