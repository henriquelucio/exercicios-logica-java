package Exercise11.Main;

public class Validator {
    public static String isStudentApproved(double averageGrade){
        if(averageGrade >= 7){
            return "Approved";
        }else{
            return "Reproved";
        }
    }
}
