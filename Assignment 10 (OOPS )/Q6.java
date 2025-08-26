class MovieRating {
  private String name;
  private String genre;
  private int rating;
  public void setter(String name, String genre,int rating){
    this.name=name;
    this.genre=genre;
    this.rating=rating;
  }
  public void details(){
    System.out.println("Movie name is : "+name);
    System.out.println("Genre of movie : "+genre);
      if(rating>8&&rating<10){
      System.out.println("Movie is Hit "+rating);
    }
     else if(rating>10){
      System.out.println("Rating is incorrect please enter range between 1-10");
    }
     else if(rating>0&&rating<8){
      System.out.println("Movie is Flop");
    }

  }

}
class MovieMain{
  public static void main(String[] args) {
    MovieRating movie=new MovieRating();
    movie.setter("Stree", "horror",15);
    movie.details();
  }
}