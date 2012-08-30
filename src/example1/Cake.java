package example1;

import javax.swing.JOptionPane;

/**
 * This class is an an abstraction of a real cake object. It demonstrates poor
 * encapsulation.
 * 
 * @author jlombardo
 */
public class Cake {
    private String cakeName;
    //// Both of these properties violate encapsulation rules. All should be
    // declared private scope and should have getter and/or setter methods.
    ///////

    // default scope -- visible only to classes in the same package
    int quantity;

    // protected scope -- visible to classes in the same package, or to
    // subclasses of this class in any package.
    protected int size;

    //// Some of the methods below violate encapsulation rules. Many should
    //   be private, those that have arguments (setters) need validation rules.
    ////////

    public void setCakeName(String name) {
        this.cakeName = name;
    }
    
    public int getQuantity() {
        return quantity;
    }

    // VERY BAD! quantity should be validated for legal range
    private void gatherIngredients(int quantity) {
        this.quantity = quantity;
        System.out.println("Ingredients gathered");
    }

    private void mixIngredients() {
        System.out.println("Ingredients mixed");
    }

    public void bake(int quantity) {
        // gaurintuee that the method call sequence 
        gatherIngredients(quantity);
        mixIngredients();
        //bakeing code
         takeFromOvenAndLetCool();
        
        
        System.out.println("Baking...");
    }

    private void takeFromOvenAndLetCool() {
        System.out.println("All done baking, removed from oven, cooling...");
    }
}
