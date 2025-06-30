class VideoGames {

    static String gameName = "Legend of Varya";
    static String genre = "Action RPG";
    static String platform = "PC, PlayStation, Xbox";
    static String developer = "Nebula Interactive";
    static String publisher = "Firestorm Games";
    static String engine = "Unreal Engine 5";
    static String rating = "Teen";
    static String language = "English";
    static String soundtrack = "Orchestral";
    static String multiplayerType = "Online Co-op";
    static String releaseRegion = "Global";

    static int releaseYear = 2024;
    static int mainQuests = 25;
    static int sideMissions = 140;
    static int playableCharacters = 8;
    static int weaponTypes = 15;
    static int skillTrees = 5;
    static int maxLevel = 60;
    static int onlinePlayersLimit = 32;

    static double gameSizeGB = 85.7;

    public static void main(String[] args) {
        System.out.println("Game: " + gameName);
        System.out.println("Genre: " + genre);
        System.out.println("Platform: " + platform);
        System.out.println("Developer: " + developer);
        System.out.println("Publisher: " + publisher);
        System.out.println("Engine: " + engine);
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        System.out.println("Soundtrack: " + soundtrack);
        System.out.println("Multiplayer: " + multiplayerType);
        System.out.println("Region: " + releaseRegion);
        System.out.println("Year: " + releaseYear);
        System.out.println("Main Quests: " + mainQuests);
        System.out.println("Side Missions: " + sideMissions);
        System.out.println("Characters: " + playableCharacters);
        System.out.println("Weapons: " + weaponTypes);
        System.out.println("Skill Trees: " + skillTrees);
        System.out.println("Max Level: " + maxLevel);
        System.out.println("Online Limit: " + onlinePlayersLimit);
        System.out.println("Game Size: " + gameSizeGB + " GB");
    }
}