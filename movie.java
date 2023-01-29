class movie
{

  String title;
  String studio;
  String rating;


 public movie(String title,String studio,String rating)


   {
      this.title=title;
      this.studio=studio;
      this.rating=rating;
          
   }

   public movie(String title,String studio)
 {
    this.title=title;
      this.studio=studio;

}

public String getrating()
{
  return rating;
}

public void setrating(String rating)
{
 this.rating=rating;
}

  public static void main(String[] arg)
{
   movie m=new movie("karma","d-beats production","pg-12");
   movie n=new movie("karma2","boss production","pg-13");
   System.out.println("----First constructor display---\n movie title:-" +m.title);
   System.out.println("studio name:-" +m.studio);
   System.out.println("");
   System.out.println("----second constructo display---\n  movie title:-" +n.title);
   System.out.println("studio name:-" +n.studio); 
   System.out.println("");
   System.out.println(m.getrating());
}
}