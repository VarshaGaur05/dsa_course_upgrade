package Queues;

import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;

class QueuesMovies {
    public String title;
    public int rating;

    public QueuesMovies(String title) {
        this.title = title;
        this.rating = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        System.out.println("Giving " + rating + " star(s) to the movie " + this.title);
        this.rating = rating;
    }
}

class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueuesMovies movie1 = new QueuesMovies("Dangal");
        QueuesMovies movie2 = new QueuesMovies("Gangs of Wasseypur");
        QueuesMovies movie3 = new QueuesMovies("Tubelight");
        QueuesMovies movie4 = new QueuesMovies("Padvamat");

        Queue<QueuesMovies> movieQueue = new LinkedList<QueuesMovies>();
        movieQueue.add(movie1);
        movieQueue.add(movie2);
        movieQueue.add(movie3);
        movieQueue.add(movie4);

        int[] movieRatings = { 5, 3, 4, 1 };
        String[] movieTitles = { "Gangs of Wasseypur", "Padvamat", "Dangal", "Tubelight" };
        for (int i = 0; i < 4; i++) {
            int rating = movieRatings[i];
            String title = movieTitles[i];
            // Iterate over Queue to find the movie with the correct title and update its
            // Rating
            while (title != movieQueue.peek().getTitle()) {
                movieQueue.add(movieQueue.remove());
            }
            movieQueue.peek().setRating(rating);
        }
    }
}
/*
Queues
Description
You have movies in a Queue, and you wish to update the ratings which you got for them. However, the order of ratings is different from the order in the queue.
Your task is to iterate the queue, and update the rating for the correct movie, for all movies you have ratings for.
The movie object contains the title and the rating of the movie.
You will define a queue of Movie objects as:
Queue<Movie> movieQueue = new LinkedList<Movie>();

Input:
 No input required

Output:
Giving 5 star(s) to the movie Gangs of Wasseypur
Giving 3 star(s) to the movie Padvamat
Giving 4 star(s) to the movie Dangal
Giving 1 star(s) to the movie Tubelight
 */
