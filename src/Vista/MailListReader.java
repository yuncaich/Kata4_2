package Vista;

import Modelo.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {


    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            IteratorReader iteratorreader = new IteratorReader(reader);
            
            for (String line : iteratorreader)
                if (Mail.isMail(line))
                    list.add(new Mail(line));
            /*while (true) {
                String line = reader.readLine();
                if (line == null)
                    break;
                if (Mail.isMail(line))
                    list.add(new Mail(line));
            }*/   
        } 
        catch (FileNotFoundException exception) {
            System.out.println("ERROR MailListReader::read (File Not Found) " + exception);
        }
        catch (IOException exception) {
            System.out.println("ERROR MailListReader::read (IO) " + exception);
        }
        
        
        
        return list;
    }
    
}
