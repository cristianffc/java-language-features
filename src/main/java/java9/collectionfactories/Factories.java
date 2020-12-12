package java9.collectionfactories;

import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.Map.entry;

public class Factories {

    public static void main(String[] args) {
        List<String> friendsList = List.of("Raphael", "Olivia", "Thibaut");
        System.out.println(friendsList);

        Set<String> friendsSet = Set.of("Raphael", "Olivia", "Thibaut");
        System.out.println(friendsSet);

        Map<String, Integer> ageOfFriends
                = Map.of("Raphael", 30, "Olivia", 25, "Thibaut", 26);
        System.out.println(ageOfFriends);

        Map<String, Integer> ageOfFriendsOfEntries
                = Map.ofEntries(entry("Raphael", 30),
                entry("Olivia", 25),
                entry("Thibaut", 26));
        System.out.println(ageOfFriendsOfEntries);
    }
}
