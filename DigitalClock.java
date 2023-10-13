import java.awt.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat,dayFormat,dateFormat;
    JLabel timeLable,dayLable,dateLable;
    String time,day,date;


    DigitalClock() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("@Samarth Bagul");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLable = new JLabel();
        dayLable = new JLabel();
        dateLable = new JLabel();

        time = timeFormat.format(Calendar.getInstance().getTime());

        timeLable.setText(time);
        timeLable.setFont(new Font("",Font.PLAIN,50));
        timeLable.setForeground(new Color(0x00FF00));
        timeLable.setBackground(Color.black);
        timeLable.setOpaque(true);

        dayLable.setFont(new Font("",Font.PLAIN,35));
        dateLable.setFont(new Font("",Font.PLAIN,35));

        this.add(timeLable);
        this.add(dayLable);
        this.add(dateLable);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLable.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLable.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLable.setText(date);

            try{
            Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String []clock) {
        new DigitalClock(); 
    }
}
