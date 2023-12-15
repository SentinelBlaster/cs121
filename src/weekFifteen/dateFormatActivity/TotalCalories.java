package weekFifteen.dateFormatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TotalCalories {
    private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public int  calcCalories(int numCals, String start, String end){
        int days = 0;
        try {
            Date starting = dateFormat.parse(start);
            Date ending = dateFormat.parse(end);
            long difference = ending.getTime() - starting.getTime();
            days = (int) TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);

        } catch (ParseException e){
            e.printStackTrace();
        }
        return numCals*days;
    }
}
