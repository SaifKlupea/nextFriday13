import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Logger;

public class App {

    private static Logger log = Logger.getLogger(App.class.getName());


    public static void main(String[] args){

        LocalDate nextFriday13 = LocalDate.now();

        log.info("TODAY IS : "+nextFriday13.toString());
        log.info("DAY of Month today is : "+nextFriday13.getDayOfMonth());


        //find next friday (any friday)
        while(DayOfWeek.FRIDAY != nextFriday13.getDayOfWeek()) {
            nextFriday13 = nextFriday13.plusDays(1);
        }

        log.info("next ordinary friday will be "+nextFriday13.toString());

        //here we are sure that the var contains a friday
        while(13 != nextFriday13.getDayOfMonth()){
            nextFriday13 = nextFriday13.plusDays(7);
        }


        log.info("next friday 13 is : "+nextFriday13.toString()
                +"\n"+"will be in "+ ChronoUnit.DAYS.between(LocalDate.now(), nextFriday13)+" days");
        
        log.info("this line is edited from github");
        
    }
}
