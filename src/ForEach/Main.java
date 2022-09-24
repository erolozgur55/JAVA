package ForEach;

public class Main {
    public static void main(String[] args) {
        
        String[] array = {"Orange","Banana","Pear"};
        int[] array2  = {11,12,13,14,15,16,17};
        trys[] array3 = {new trys("Erol"),new trys("John"),new trys("Eric")};
        
        for (trys d : array3) {
            d.write();
            
        }
        for (int i: array2){
            System.out.println();
            System.out.print(i);

        }
        for (String a : array) {
            System.out.println();
            System.out.print(a);

        }
    }
    
}
