public class Main {
    public static void main(String[] args) {
        System.out.println("Running my Type Casting Example");
        Utensil myUtensil= new Knife();
        Knife myKnife = (Knife)myUtensil; 
        
        System.out.println(myKnife.getClass().toString());
    }
}
