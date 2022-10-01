package Implement.Example2;

public class Duck extends hayvanlar implements Sailing,Flying {
    @Override
    public String food() {
        return "Duck is a constantly hungry Animal that can both fly and swim.";
    }
}
