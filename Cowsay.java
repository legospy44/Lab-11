public class Cowsay {
   public static void main(String[] args) {

     Cow[] cows = HeiferGenerator.getCows(); //creates the list of cows from HeiferGenerator

     if (args[0].equals("-l")) { //what happens when the user enters -l
        System.out.print("Cows available: ");
        listCows(cows);
        System.out.println();
     } else if (args[0].equals("-n")) { //what happens when the user enters -n
       if (args[1].equals("heifer")) { //after the user enters -n, what happens if they enter heifer
          System.out.println();
          for (int i = 2; i < args.length; i++) {  //prints all of the words if there is more than one
          System.out.print(args[i]+ " ");
     }
          System.out.println();
          System.out.println(findCow("heifer", cows).getImage());  //gets heifer image
       } else if (args[1].equals("kitteh")) { //after the user enters -n, what happend if they enter kitteh
          System.out.println();
            for (int i = 2; i < args.length; i++) {  //prints all of the words if there is more than one
            System.out.print(args[i]+ " ");
       }
           System.out.println();
           System.out.println(findCow("kitteh", cows).getImage()); //gets kitteh image
       } else {
         System.out.println("Could not find " + args[1] + " cow!"); //what happens they enter a name not on the list
         System.out.println();
       }
     } else {
          System.out.println();
          for (int i = 0; i < args.length; i++) {  //prints all of the words if there is more than one
          System.out.print(args[i]+ " ");
     }
        System.out.println();
        System.out.println(findCow("heifer", cows).getImage()); //gets the basic (heifer) image
     }
  
}

   private static void listCows(Cow[] cows) { //method to list all of the cows available
     for (int i = 0; i < cows.length; i++) {
         System.out.print(cows[i].getName() + " ");
   }
     System.out.println();
}

   private static Cow findCow(String name, Cow[] cows) { //method to find the cow through its name and the actual list of cows
      Cow resultCow = null; //null so it basically sets everything to 0
 
      for (int i = 0; i < cows.length; i++) {
          if (name.equals(cows[i].getName())) {
            resultCow = cows[i];
          }
      }
    return resultCow;
   }
}
