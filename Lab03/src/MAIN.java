import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MAIN {

    public static void main(String[] args) {
        //Introduce
        myIntroduce rem = new myIntroduce();
        rem.Introduce();
        //Main
        HANGHOA hh = new HANGDIENMAY();
        hh.input();
        hh.output();

    }
}
