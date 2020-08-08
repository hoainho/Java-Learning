import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class myIntroduce {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
    Calendar callTime = Calendar.getInstance();
    String timePublish = "09/08/2020 01:12:01 AM";
    public void Introduce(){
        callTime.add(Calendar.MINUTE, -30);
        Date date = callTime.getTime();
        System.out.println("\t\t\t\t\t\t~~~~~~~~~~~~XIN CHÀO CÁC BẠN MÌNH LÀ HOÀI NHỚ~~~~~~~~~~~");
        System.out.println("\t\t\t\t\tChương Trình Của Mình Được viết vào lúc : "+ timePublish + "\n\t\t\t\t\t\t\t\t\t\t\t\tVà Hiện Tại : " + sdf.format(date));
    }



}


