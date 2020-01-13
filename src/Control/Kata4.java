package Control;

import Modelo.Mail;
import Vista.HistogramDisplay;
import java.util.List;
import Modelo.Histogram;
import Vista.MailHistogramBuilder;
import Vista.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = new String ("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        histogramdisplay.execute();
    }
    
}