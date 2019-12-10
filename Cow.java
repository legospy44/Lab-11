public class Cow {
   private String name; //private String for the name of the cow
   private String image; //private string for the image being printed by HeiferGenerator.java

   public Cow(String name) { //constructor for Cow objects 
     this. name = name;
   }

   public String getName() { //gets the name for the cow
      return name;
   }

   public String getImage() { //gets the image being printed 
      return image;
   }

   public void setImage(String _image) { //sets the image from HeiferGenerator.java
      image = _image;
   }
}
