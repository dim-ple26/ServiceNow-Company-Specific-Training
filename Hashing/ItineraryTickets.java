package Hashing;

import java.util.HashMap;

public class ItineraryTickets {


    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> rev = new HashMap<>();
        for(String key: tick.keySet()){
            rev.put(tick.get(key),key);
        }

        for(String key: tick.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null;

    }

    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.println(start);
            start = tickets.get(start);

        }
        System.out.println(start);
    }
    
}
