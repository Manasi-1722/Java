// Question:
// Create class Movie with below attributes: 

// movieName - String 
// company - String 
// genre - String 
// budget - int

// Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
// take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
// objects where the searchGenre String matches with the original array of Movie object's genre attribute 
// (case insensitive search).

// Write necessary getters and setters.

// Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
// attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
// logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
// print "Low Budget Movie".

// Input
// ---------
// aaa
// Marvel
// Action
// 250000000
// bbb
// Marvel
// Comedy
// 25000000
// ccc
// Marvel
// Comedy
// 2000000
// ddd
// Marvel
// Action
// 300000000
// Action

// Output
// -------------------
// High Budget Movie
// High Budget Movie

import java.util.Arrays;
import java.util.Scanner;

public class ps_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] arr = new Movie[4];
        for(int i=0; i<4; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Movie(a, b, c, d);
        }

        String searchGenre = sc.nextLine();

        String[] res = getMovieByGenre(arr, searchGenre);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }



        sc.close();
    }

    public static String[] getMovieByGenre(Movie[] arr, String searchGenre){
        String[] arr2 = new String[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i].getGenre().equalsIgnoreCase(searchGenre)){
                if(arr[i].getBudget() > 80000000) {
                    arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                    arr2[arr2.length - 1] = "High Budget Movie";
                }
                else {
                    arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                    arr2[arr2.length - 1] = "Low Budget Movie";
                }
                
            }
        }
        return arr2;
    }
}


class Movie {
    String movieName;
    String company;
    String genre;
    int budget;

    // constructor
    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    // getter
    public String getMovieName() {
        return movieName;
    }

    public String getCompany() {
        return company;
    }
    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }

    // setter
    // public void setMovieName(String movieName) {
    //     this.movieName = movieName;
    // }

    // public void setCompanyName(String company) {
    //     this.company = company;
    // }

    // public void setGenre(String genre) {
    //     this.genre = genre;
    // }

    // public void setMBudget(int budget) {
    //     this.budget = budget;
    // }



    
}
