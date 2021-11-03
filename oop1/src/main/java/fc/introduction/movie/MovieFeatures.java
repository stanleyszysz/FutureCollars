package fc.introduction.movie;

class MovieFeatures {
    private String title;
    private String director;
    private int movieDuration;
    private int yearProduction;

    public MovieFeatures(String title, String director, int movieDuration, int yearProduction) {
        this.title = title;
        this.director = director;
        this.movieDuration = movieDuration;
        this.yearProduction = yearProduction;
    }

    public void aboutMovie() {
        System.out.println("Your Movie is \"" + title + "\"");
        System.out.println("Directed by " + director +".");
        System.out.println("Duration is " + movieDuration + " minutes.");
        System.out.println("The movie was produced in the " + yearProduction + " year.");
    }

}
