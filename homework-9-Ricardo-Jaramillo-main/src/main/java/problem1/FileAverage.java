package problem1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileAverage {

    private FileAverage(){
    }

    public static double averageOfLineAverages(String fileName){

        try (FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);)
        {
            List<Double> al = new ArrayList<>();

            double sumLine = 0;
            double avg = 0;

            while (br.ready()){
                sumLine = 0;
                String[] line = br.readLine().split(", ");

                for (int i = 1; i < line.length; i++){
                    sumLine += Double.parseDouble(line[i]);
                }
                System.out.println("avgLine: " + sumLine/(line.length-1));
                Double dbl = sumLine/(line.length-1);
                al.add(dbl);
            }

            if (al.size() != 0){
                for(double dbl: al){
                    avg += dbl;
                }
                avg = avg/al.size();
            }else{
                avg = 0;
            }
            System.out.println("avg: " + avg);
            return avg;

        }catch (FileNotFoundException e){
            System.out.println(e.toString());
            return 0;
        }catch (IOException e){
            System.out.println(e.toString());
            return 0;
        }
    }

    public static void main(String[] args) {
        FileAverage.averageOfLineAverages("C:\\Users\\rjara\\Documents\\MEGAsync\\Proyectos\\Programming" +
                "\\Java\\NEIU Programming II\\homework-9-Ricardo-Jaramillo\\src\\main\\resources\\file1.txt");

    }
}
