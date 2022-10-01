package Implement.Exampl1;

public class DMGfile implements ReadFile{
    @Override
    public String open() {return "opening.dmg";}

    @Override
    public String read() {
        return "reading.dmg";
    }

    @Override
    public String save() {
        return "saving.dmg";
    }

    @Override
    public String close() {
        return "closing.dmg";
    }
}
