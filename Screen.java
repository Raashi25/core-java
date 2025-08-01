class Screen {
    int screenNumber;
    int capacity;
    Movie movie;

    public void getScreenInfo() {
        System.out.println("Screen No: " + screenNumber);
        System.out.println("Capacity: " + capacity);
        movie.getMovieInfo();
    }
}