package Week3LabBookDay10;
/**
 25. protected class base {
      String Method() {
       return "Wow";
      }
     }
     class dervied {
      public void useD() {
       base z = new base();
       System.out.println("base says, " + z.Method());
      }
     }
 Compile this and see what happens
 Author:KGN 21106 - Ishtiaq Ahmed
**/
class base25 {
 String Method() {
 return "Wow";
 }
}
class dervied {
 public void useD() {
  base25 z = new base25();
  System.out.println("base says, " + z.Method());
 }
}
