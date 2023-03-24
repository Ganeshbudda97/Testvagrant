package testvagrant;

import java.util.*;

public class RecentlyPlayedStore {

    private int capacity; // capacity of the store
    private Map<String, LinkedList<String>> store; // map to store user and their recently played songs
// Creating a constructor to initialize the capacity
    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
    }
/*
 * add() method with (String,String) type argument used to store the songs  in key value pair in single store
 * they can store N number of songs based on the capacity.
 */
    public void add(String user, String song) {
        if (!store.containsKey(user)) {
            store.put(user, new LinkedList<String>());
        }
        /*
         * in this we are trying to remove the least recently played song when user trying
         * to add the song which is greater than the initial capacity
         * we are using a LinkedList of String type to store the user songs
         */
        LinkedList<String> songs = store.get(user);
        if (songs.size() == capacity) {
            songs.removeFirst();
        }
        songs.addLast(song);
    }

    public List<String> getRecentlyPlayedSongs(String user) {
        return store.getOrDefault(user, new LinkedList<>());
    }
}
