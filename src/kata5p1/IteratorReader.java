package kata5p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class IteratorReader implements Iterable<String> {
    private final BufferedReader reader;
    
    public IteratorReader(BufferedReader reader) {
        this.reader = reader;
    }
    
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            String current_line = readLine();
            
            @Override
            public boolean hasNext() {
                return current_line != null;
            }
            
            @Override
            public String next() {
                String result = current_line;
                current_line = readLine();
                return result;
            }
            
            private String readLine() {
                try {
                    return reader.readLine();
                }
                catch (IOException exception){
                    System.out.println("ERROR MailListReader::read (IO)" + exception.getMessage());
                    return null;
                }
            }
        };
    }
}
