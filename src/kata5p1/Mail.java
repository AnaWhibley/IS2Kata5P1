package kata5p1;

public class Mail {
    
    String mail;
    
    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }
    
    public static boolean isMail (String lineFile) {
        return lineFile.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
}
