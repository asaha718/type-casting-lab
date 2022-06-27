public class Knife extends Utensil {
    public boolean needsSharpening;

    public void using() {
        System.out.println("Chopping greens");
    }
    
    public void sharpen() {
        System.out.println("Shapening blade");
    }
}
