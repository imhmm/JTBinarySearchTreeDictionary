
public class DictionaryNode {
   //private String firstName;
   protected int key;
   /*
   private String lastName;
   private String streetAdd;
   private String city;
   private int zip;
   private String email;
   private String phoneNum;
   //7 in total
   */
   protected DictionaryNode left;
   protected DictionaryNode right;


   public DictionaryNode (int data) {
      //this(key, null, null);
      this.key = data;
      this.left = null;
      this.right = null;
   }

   /*
   public DictionaryNode (int data/*, String lastName, String streetAdd, String city, int zip, String email, String phoneNum, DictionaryNode left, DictionaryNode right) {

      //this.firstName = firstName;
      this.key = data;
      this.left = left;
      this.right = right;
   
   }
   */







/*
      this.lastName = lastName;
      this.streetAdd = streetAdd;
      this.city = city;
      this.zip = zip;
      this.email = email;
      this.phoneNum = phoneNum;
      */




}//end of DictionaryNode