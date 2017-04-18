/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasbih;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author hadi
 */
public class SaveAndLoad {
    private final File file;
    private FileWriter writeData;
    private FileReader readData;
    private int number = 0;
    public SaveAndLoad()throws IOException{
        file = new File(".TasbihData");
        if(file.exists() == false)
            file.createNewFile();
    }
    
    public void writeFile(String string) throws IOException{
        writeData = new FileWriter(file);
        writeData.write(string);
        writeData.flush();
        
    }
    public void readFile() throws IOException{
        readData = new FileReader(file);
        Scanner scanner = new Scanner(file);
        int [] tall = new int [100];
        int i = 0;
        while(scanner.hasNextInt())
        {
            tall[i] = scanner.nextInt();
            number = number * 10 + tall[i];
            i++;
        }
    }
    
    public String getNumber(){
        return Integer.toString(number);
    }
}
