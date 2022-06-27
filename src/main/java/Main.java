public class Main {
    public static void main(String[] args) {
        System.out.println("Running my utensil examples");
        Utensil kitchenUtensil = new Utensil(); 
        kitchenUtensil.searching();
        Knife kitchenKnife = new Knife();
        kitchenKnife.sharpen();
        Spork dinnerSpork = new Spork(); 
        dinnerSpork.slupring();
    }
}
