/* Laikin Barnard 6955 */
package studentMarksReport;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class studentMarksReport {

    public static void main(String[] args) {
        Scanner Validate = new Scanner(System.in);
        Student st = new Student();
        st.StudentNumber = 6955;
        st.TestResult = 25;
        st.AssignmentResult = 25;
        st.ExamResult = 50;

        double TResults = 0; 
        double AResults = 0;
        double EResults = 0;
        int SNumber = 0;
        
/*--------------------------------------------------------------------------------------*/
        while(SNumber <1 || SNumber > 9000){
            try{
                String StudentNumber = JOptionPane.showInputDialog(null,
                "Student Number",
                "Enter your Student Number",
                JOptionPane.QUESTION_MESSAGE  
                );
                SNumber = Integer.parseInt(StudentNumber);
            }
            catch (Exception e){
                System.out.println("Please enter 4 digit student number");
            }
        }

/*--------------------------------------------------------------------------------------*/        
        while(TResults <1 || TResults > 100){
            try{
                String TestResults = JOptionPane.showInputDialog(null,
                "Test Results ",
                "Enter your Test Results",
                JOptionPane.QUESTION_MESSAGE  
                );
                TResults = Double.parseDouble(TestResults);        
            }
            catch (Exception e){
                System.out.println("Please enter ");
            }        
        }

/*--------------------------------------------------------------------------------------*/        
        while(AResults <1 || AResults > 100){
            try{
                String AssignmentResult = JOptionPane.showInputDialog(null,
                "Assignment Result",
                "Enter your Assignment Result",
                JOptionPane.QUESTION_MESSAGE  
                );
                AResults = Double.parseDouble(AssignmentResult); 
            }
            catch (Exception e){
                System.out.println("Please enter 4 digit student number");
            }
        }

/*--------------------------------------------------------------------------------------*/
        while(EResults <1 || EResults > 100){
            try{
                String ExamResult = JOptionPane.showInputDialog(null,
                "Exam Result ",
                "Enter your Exam Result",
                JOptionPane.QUESTION_MESSAGE  
                );
                EResults = Double.parseDouble(ExamResult);
            }
            catch (Exception e){
                System.out.println("Please enter 4 digit student number");
            }
        }
/*--------------------------------------------------------------------------------------*/
        double TotalScore = (((TResults + AResults) * 0.25) + (EResults * 0.5));
        System.out.println(TotalScore);

/*--------------------------------------------------------------------------------------*/        
        JOptionPane.showMessageDialog(null,
        ("Student: "+ SNumber + " Final Report: " + TotalScore),
        "Student Result",
        JOptionPane.PLAIN_MESSAGE);
    
    }
}
