class Loan{
    float getIR(){
        return 5.0f;
    }
}

class GoldLoan extends Loan{
    float getIR(){
        return 7.5f;
    }
}

class StudyLoan extends Loan{
    float getIR(){
        return 12.5f;
    }
}

class CraftLoan extends Loan{

}
public class MethodOverriding1 {
    public static void main(String[] args){
        Loan goldLoan = new GoldLoan();
        goldLoan.getIR();
        System.out.println("Gold Loan  : "+goldLoan.getIR()+"%");
        System.out.println();

        Loan studyLoan = new StudyLoan();
        studyLoan.getIR();
        System.out.println("Study Loan : "+studyLoan.getIR()+"%");
        System.out.println();

        Loan cratfLoan = new CraftLoan();
        System.out.println("Craft Loan : "+cratfLoan.getIR()+"%");
    }
}
