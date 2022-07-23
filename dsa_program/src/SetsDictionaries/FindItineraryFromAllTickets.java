package SetsDictionaries;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindItineraryFromAllTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the no of tickets from input
        int n = in.nextInt();

        // map to store all the tickets
        Map<String, String> tickets = new HashMap<String, String>();

        // Store the source and destination of the tickets to the map "tickets"
        for (int i = 0; i < n; i++) {
            tickets.put(in.next(), in.next());
            in.nextLine();
        }

        // write your code here
        Map<String, String> reverseMap = new HashMap<String, String>();

        // To fill reverse map, iterate through to given map
        for (Map.Entry<String,String> entry: tickets.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());

        // Find the starting point of itinerary
        String start = null;
        for (Map.Entry<String,String> entry: tickets.entrySet())
        {
            if (!reverseMap.containsKey(entry.getKey()))
            {
                start = entry.getKey();
                break;
            }
        }

        Map.Entry<String, String> first= reverseMap.entrySet().iterator().next();


        // If we could not find a starting point, then something wrong
        // with input
        if (start == null)
        {
            System.out.println("Invalid");
            return;
        }

        // Once we have starting point, we simple need to go next, next
        // of next using given hash map
        String to = tickets.get(start);
        while (to != null)
        {
            System.out.print(start+ " ");
            start = to;
            to = tickets.get(to);
        }

        System.out.print(first.getKey());

    }

}
/*
Find Itinerary From all Tickets
Description
You will be given the source and destination of all the tickets in the form of a map, and you have to print the itinerary from all those tickets.

Note:

The path covered by the tickets is not circular.
Other than the final destination, there is exactly one ticket from every city.


Input: The input will be in the following format:

The first line will be an integer ‘n’ indicating the size of the map containing the source and the destination of all the tickets.
The next ‘n’ lines will be the source and the destination of all the tickets.
Each line represents the source and the destination of each ticket, separated by space.




Output: The output should be in the following format

Print all the names of the cities in the itinerary, separated by a space.
Note:
If you cannot get the start of the itinerary, print 'Invalid'.
If multiple itineraries are possible and if they are also valid, then print the itinerary that is the largest in lexicographical order when the complete itinerary is treated as a string. Refer to the ‘Sample Test case 2’ given below.


Sample test case 1:

Input:

4
Mumbai Indore
Hyderabad Warangal
Indore Hyderabad
Delhi Mumbai
Output:

Delhi Mumbai Indore Hyderabad Warangal




Sample test case 2:

Input:

2
abc def
abc deg


Output:

abc deg


Sample test case 3:

Input:

3
abc def
abc deg
deg fgt


Output:

abc deg fgt
 */

