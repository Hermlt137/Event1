import java.util.Date;  
import java.util.Scanner;  
import java.util.ArrayList;  
import java.util.List;  
  
public class Event {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        List<Event> events = new ArrayList<>();  
  
         
        while (true) {  
            System.out.println("Please enter the details of an event (or 'exit' to quit):");  
  
             
            System.out.print("Enter event name: ");  
            String eventName = scanner.nextLine();  
            if (eventName.equalsIgnoreCase("exit")) {  
                break;   
            }  
  
             
            System.out.print("Enter event venue: ");  

            String eventVenue = scanner.nextLine();  
  
              
            System.out.print("Enter event date (YYYY-MM-DD): ");  
            String eventDateString = scanner.nextLine();  

 
             
            System.out.print("Enter the names of the participants (separated by commas): ");  
            String[] participantNames = scanner.nextLine().split(",");  
            
            
            System.out.println("Created event:");  
            System.out.println("event");  
  
            
            System.out.println("All events created:");  
            for (Event e : events) {  
                System.out.println(e);  
            }  
        }  
  
         
        scanner.close();  
    }  
}