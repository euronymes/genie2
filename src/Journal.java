import java.io.PrintWriter;

public class Journal {
    public Journal getInstance(){
        return this;
    }
    public void ecrire(String str){
        PrintWriter writer = new PrintWriter("domotique.log", UTF-8);
        writer.println(java.time.Instant());
        writer.println(str);
        writer.close();
    }

}
