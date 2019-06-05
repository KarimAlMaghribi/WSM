package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {



    public String getStrDate(Date date){

        Date timedate = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss.sss");
        String strDate = dateFormat.format(date);

        return strDate;
    }

}
