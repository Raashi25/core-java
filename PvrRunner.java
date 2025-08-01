class PvrRunner {
    public static void main(String[] film) {
        Movie movie = new Movie();
        movie.title = "Inception";
        movie.genre = "Sci-Fi";

        Screen screen = new Screen();
        screen.screenNumber = 1;
        screen.capacity = 150;
        screen.movie = movie;

        Pvr pvr = new Pvr("PVR Orion", "Bangalore", screen);

        pvr.getPvrInfo();
    }
}
