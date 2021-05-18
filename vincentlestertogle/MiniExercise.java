import java.util.Locale;
import java.util.Scanner;

public class MiniExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String[] telecomPh = new String[4];
//        telecomPh[0] = "Globe";
//        telecomPh[1] = "Converge";
//        telecomPh[2] = "DITO";
//        telecomPh[3] = "PLDT";
//
//        for(int i=0; i < telecomPh.length; i++){
//            System.out.println(telecomPh[i]);
//        }

//        for(int i=0; i<nameOfStudents.length; i++) {
//            for(int j=0; j<nameOfStudents[i].length; j++) {
//                String inputName = scan.nextLine();
//                nameOfStudents[i][j] = inputName.toLowerCase();
//            }
//        }

        String[][] nameOfStudents = new String[5][6];
        System.out.println("Input Name of Students: ");
        nameOfStudents[0] = new String[]{"STUDENTNAMEAA","STUDENTNAMEAB","STUDENTNAMEAC","STUDENTNAMEAD","STUDENTNAMEAE","STUDENTNAMEAF"};
        nameOfStudents[1] = new String[]{"StudentNameBA","StudentNameBB","StudentNameBC","StudentNameBD","StudentNameBE","StudentNameBF"};
        nameOfStudents[2] = new String[]{"sTUDENTnAMEca","sTUDENTnAMEcb","sTUDENTnAMEcc","sTUDENTnAMEcd","sTUDENTnAMEce","sTUDENTnAMEcf"};
        nameOfStudents[3] = new String[]{"studentnameda","studentnamedb","studentnamedc","studentnamedd","studentnamede","studentnamedf"};
        nameOfStudents[4] = new String[]{"StUdEnTnAmEea","StUdEnTnAmEeb","StUdEnTnAmEec","StUdEnTnAmEed","StUdEnTnAmEee","StUdEnTnAmEef"};

        System.out.println("");
        System.out.println("List of Students: ");
        for(int i=0; i<nameOfStudents.length; i++) {
//            System.out.print("Row " + (i+1) + ": ");
            for(int j=0; j<nameOfStudents[i].length; j++) {
                if(j == 5) {
                    System.out.print(nameOfStudents[i][j].toLowerCase());
                } else {
                    System.out.print(nameOfStudents[i][j].toLowerCase() + ",  ");
                }
            }
            System.out.println("");
        }
        System.out.println(nameOfStudents[1][1].indexOf("a"));
    }
}
