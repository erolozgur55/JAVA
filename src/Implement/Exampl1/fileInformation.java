package Implement.Exampl1;

import java.util.ArrayList;

public class fileInformation {
    public static void main(String[] args) {

        TxtFile txtFile=new TxtFile();
        PowerPointFile powerPointFile=new PowerPointFile();
        DMGfile dmGfile=new DMGfile();
        EXEfile exEfile=new EXEfile();

        ArrayList<ReadFile> file1=new ArrayList<>();
        file1.add(txtFile);
        System.out.println();
        file1.add(powerPointFile);
        file1.add(dmGfile);
        file1.add(exEfile);

        for (ReadFile t:file1 ) {
            System.out.println(t.getClass().getSimpleName());
            System.out.println("***************************");
            System.out.println("File Extensions : " +t.open()+" // "+t.close()+" // "+t.read()+" // "+t.save());
            System.out.println();

        }










    }
}
