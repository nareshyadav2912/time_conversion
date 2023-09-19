import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) { 

        Scanner sc=new Scanner(System.in);

        Instant currentUtcTime = Instant.now();

        System.out.println("Get Your country Related Zone ids Ex for India time zone your region is Asia and city is kolkata");

        System.out.println("Enter your Region");

        String country=sc.next();

        System.out.println("Enter your City");

        String city=sc.next();

        String s=country+"/"+city;

        ZoneId londonZoneId = ZoneId.of(s);

        ZonedDateTime londonTime = currentUtcTime.atZone(londonZoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current UTC Time: " + currentUtcTime);

        System.out.println(s+" Time: " + londonTime.format(formatter));

    }
}
