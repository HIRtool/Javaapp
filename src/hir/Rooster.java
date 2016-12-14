package hir;

import java.awt.*;

import javax.swing.*;

import com.mindfusion.common.*;
import com.mindfusion.drawing.*;
import com.mindfusion.scheduling.*;
import com.mindfusion.scheduling.awt.*;
import com.mindfusion.scheduling.model.*;

public class Rooster extends JFrame {

    AwtCalendar calendar;
    Recurrence recurrence;

    protected Rooster() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setTitle("Examenoverzicht");
        //setMinimumSize(new Dimension(1700,1200));
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        BorderLayout layout = new BorderLayout();
        getContentPane().setLayout(layout);


        // Calendar initialization start
        calendar = new AwtCalendar();
        calendar.beginInit();
        
        //set the current time
        calendar.setCurrentTime(DateTime.now());
        
        
        //set the date for monthview
        DateTime selectedDate = new DateTime(2017,1,1);
        calendar.setDate(selectedDate);
        //calendar.getSelection().set(selectedDate);

        // Set the view settings
        calendar.setCurrentView(CalendarView.SingleMonth);
        calendar.getMonthSettings().getDaySettings().setHeaderSize(20);
        calendar.getItemSettings().setSize(50);
        
        calendar.endInit();
        
        calendar.setEnabled(false);

        // arrange the calendar
        getContentPane().add(calendar, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public void addExamenToCalendar(DateTime start, DateTime end, String subject){
        Appointment item = new Appointment();
        
        item.setStartTime(start);
        item.setEndTime(end);
                
        item.getStyle().setBrush(Brushes.LemonChiffon);
                
        item.setSubject(subject);
        
        item.setLocked(true);
        
        item.setAllDayEvent(true);

        calendar.getSchedule().getItems().add(item);
    }

}

