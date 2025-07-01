class IPLTeams {
    static String team1 = "Chennai Super Kings";
    static String team2 = "Mumbai Indians";
    static String team3 = "Royal Challengers Bangalore";
    static String team4 = "Kolkata Knight Riders";
    static String team5 = "Rajasthan Royals";

        public static void main(String[] args) {
        System.out.println("Main started");
     
	 String team2 = "Mumbai Indians";
     String team3 = "Royal Challengers Bangalore";
     String team4 = "Kolkata Knight Riders";
     String team5 = "Rajasthan Royals";


        String teams[] = {team1, team2, team3, team4, team5};
        System.out.println("IPL Teams:");
		
		for (String team : teams){
            System.out.println(team);
        }
    }
}
