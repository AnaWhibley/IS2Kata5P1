package kata5p1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import static kata5p1.Mail.isMail;

public class MailListReader {
    
    public static List<String> read (String fileName) {
        List<String> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            
            IteratorReader iteratorReader = new IteratorReader(reader);
            for(String line : iteratorReader) {
                if(isMail(line)) {
                    list.add(line);
                }
            }
        }
        catch(FileNotFoundException exception) {
            System.out.println("ERROR MailListReader::read (File Not Fount)" + exception.getMessage());
        }
        return list;
    }
    
}