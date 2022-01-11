/*Laikin Kelly Barnard*/
package studentMarksReport;

public class Student {
    int StudentNumber;
    int TestResult;
    int AssignmentResult;
    int ExamResult;
    
    public Student (int SN, int Tr, int Ar, int Er)
    {
        SN = StudentNumber;
        Tr = TestResult; 
        Ar = AssignmentResult;
        Er = ExamResult;
    }
    
    public Student()
    {
  
        System.out.println("StudentsReport");
        
    }
        
        
    
    public int getStudentsReport (int StudentNumber, int TestResult, int AssignmentResult, int ExamResult)
    {
        return StudentNumber + TestResult + AssignmentResult  + ExamResult;
    }
    
    public class Student_Report extends Student{
       public Student_Report(){
           
       }
       @Override
       public int getStudentsReport (int StudentNumber, int TestResult, int AssignmentResult, int ExamResult)
        {
            return super.getStudentsReport(StudentNumber, TestResult, AssignmentResult, ExamResult);
        }
    
    }

}
