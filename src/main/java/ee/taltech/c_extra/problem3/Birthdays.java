package ee.taltech.c_extra.problem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Birthdays {

    //todo A
    // Java 8 added an improved date & time API.
    // New classes were added like LocalDate, Period and others.
    // What does API mean in this context?
    // Answer: API (application programming interface) - an interface through which
    // two parts of the system can interact. In this case, the two parts of the system are,
    // on the one hand, Java8 and on the other hand this is program that uses Java 8.
    //

    //todo B
    // In the main method initialize birthdays of all of your team mates (do not have to be real birthdays).
    // Call function "oldest" to find out who is the oldest. You will have to modify "oldest" to work properly.
    // Hint: when googling add java 8 to your search
    // Print out the result (oldest date).

    //todo C
    // Create a function to find out the age of person.
    // Hint: all the classes you require are mentioned on line 10
    // Print out the result (age in years).

    public static void main(String[] args) {

        LocalDate max = LocalDate.parse("1998-09-30");
        LocalDate alex = LocalDate.parse("2002-02-10");
        LocalDate vlada = LocalDate.parse("2004-08-27");

        LocalDate oldest_date = oldest(List.of(max, alex, vlada));

        String output = oldest_date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(output);

    }

    /**
     * returns the oldest/earliest date
     */
    public static LocalDate oldest(List<LocalDate> birthDays){

        LocalDate oldest = birthDays.get(0);

        for(LocalDate i: birthDays){
            if(i.isBefore(oldest)){
                oldest = i;
            }
        }

        return oldest;
    }
}
