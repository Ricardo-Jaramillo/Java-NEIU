package problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class RandomNumberFile {

    private RandomNumberFile(){
    }

    public static void writeRandomNumbersPrintWriter(String fileName, int n, int lineCount){

        File f = new File(fileName);

        try(PrintWriter out = new PrintWriter(f)){
            int i = 1;
            while (i <= n){
                for (int j = 1; j <= lineCount && i <= n; j++){
                    out.print(i);
                    if (j == lineCount)
                        out.print("\n");
                    else if (i != n)
                        out.print(", ");
                    i++;
                }
            }
        }catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
    }

    public static void writeRandomNumbersBufferedWriter(String fileName, int n, int lineCount){


        try (FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);)
        {
            int i = 1;
            while (i <= n) {
                for (int j = 1; j <= lineCount && i <= n; j++) {
                    bw.write(String.valueOf(i));
                    if (j == lineCount)
                        bw.newLine();
                    else if (i != n)
                        bw.write(", ");
                    i++;
                }
            }

        }catch (IOException e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        RandomNumberFile.writeRandomNumbersBufferedWriter("C:\\Users\\rjara\\Documents\\MEGAsync\\" +
                "Proyectos\\Programming\\Java\\NEIU Programming II\\homework-9-Ricardo-Jaramillo\\src\\main" +
                "\\resources\\randBWA.txt", 15, 4);

        RandomNumberFile.writeRandomNumbersPrintWriter("C:\\Users\\rjara\\Documents\\MEGAsync" +
                "\\Proyectos\\Programming\\Java\\NEIU Programming II\\homework-9-Ricardo-Jaramillo\\src\\main" +
                "\\resources\\randPWA.txt", 43, 7);

    }
}
