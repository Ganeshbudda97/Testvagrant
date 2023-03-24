package testvagrant;

public class SongTest {
    public static void main(String[] args) {
    	/*
    	 *  create an instance variable for RecentlyPlayedStore store with a capacity of 5 songs per user
    	 */
        RecentlyPlayedStore store = new RecentlyPlayedStore(5); 
        /*
         * adding the songs in to the key value pair with map interface
         */
        store.add("RRR", "Dosti");
        store.add("RRR", "Natu Natu");
        store.add("RRR", "janani");
        store.add("RRR", "komuram bheemudo");
        store.add("RRR", "Raamam Raghavam");
        store.add("RRR", "Komma uyyala");
        store.add("bahubali", "mamatala talli");
        store.add("bahubali", "dhivara");
        store.add("bahubali", "sivuni aana");
        store.add("bahubali", "manohari");
        store.add("pushpa", "sami sami");
        store.add("pushpa", "sri valli");
        store.add("pushpa", "oo antava");
        store.add("pushpa", "eyy bidda");
        store.add("pushpa", "dakko dakko ");
        store.add("pushpa", "song6"); // song sami sami should be removed since the store is at full capacity for pushpa
        System.out.println(store.getRecentlyPlayedSongs("RRR")); //[Natu Natu, janani, komuram bheemudo, Raamam Raghavam, Komma uyyala]
        System.out.println(store.getRecentlyPlayedSongs("bahubali")); //[mamatala talli, dhivara, sivuni aana, manohari]
        System.out.println(store.getRecentlyPlayedSongs("pushpa")); // [sri valli, oo antava, eyy bidda, dakko dakko , songU]
    }
}

