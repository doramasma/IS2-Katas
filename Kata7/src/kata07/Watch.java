package kata07;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Doramas Báez Bernal
 */
public class Watch {
    private static final double secondsStep = Math.PI * 2 / 60; 
    private static final double minuteStep = secondsStep / 60; 
    private static final double hourStep = minuteStep / 12; 
    private final List<Observer> observers = new ArrayList<>();
    private double seconds = (Math.PI / 2); 
    private double minutes = (Math.PI / 2); 
    private double hours = (Math.PI / 2); 
    
    
    
    public Watch() {
        Timer timer = new Timer();
        timer.schedule(TimerTask(), 0, 1000); //1000
        
    }
    
    public void add (Observer observito) {
        observers.add(observito);
    }

    public double getSeconds() {
        return seconds;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getHours() {
        return hours;
    }

    private TimerTask TimerTask() {
        return new TimerTask() {
            @Override
            public void run() {
                step();
                updateObservers();
            }
                
        };
    
    }
    
    private void step() {
        seconds = normalize(seconds - secondsStep);
        minutes = normalize( minutes - minuteStep);
        hours = normalize(hours - hourStep);
    }
    
    private void updateObservers() {
        for (Observer i : observers) {
            i.update();
        }
    }

    private double normalize(double angle) {
        return (angle + 2 * Math.PI) % (2 * Math.PI);
    }
        
    public interface Observer {
        public void update();
    }
    
}
