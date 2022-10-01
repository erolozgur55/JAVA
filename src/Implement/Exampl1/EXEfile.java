package Implement.Exampl1;

public class EXEfile implements ReadFile {
    @Override
    public String open() {return "opening.exe";}

    @Override
    public String read() {
        return "reading.exe";
    }

    @Override
    public String save() {
        return "saving.exe";
    }

    @Override
    public String close() {
        return "closing.exe";
    }
}
