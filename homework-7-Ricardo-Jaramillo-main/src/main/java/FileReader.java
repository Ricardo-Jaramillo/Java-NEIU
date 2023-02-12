import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    private FileReader(){
    }

    public static int findSumFromFile(String path){
        File f = new File(path);
        int sum = 0;

        try {
            Scanner in = new Scanner(f);

            while (in.hasNext()){
                sum += in.nextInt();
            }
            in.close();
        } catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        return sum;
    }
}
