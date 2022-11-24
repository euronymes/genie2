import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Journal {
    public Journal getInstance(){
        return this;
    }
    public void ecrire(String str) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("./domotique.log");

        writer.write("\n" +(new Timestamp((new Date()).getTime())).toString()+ "\n");


        writer.println(str);
        writer.close();
    }

}
