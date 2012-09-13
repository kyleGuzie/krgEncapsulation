/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.Two.KRG;

/**
 * * ***LabTwo*****
 * *Advanced Java
 *
 *
 * 9/12/12
 * @author Kyle Guzikowski
 * @version 1.0
 *
 *
 * Description
 *
 * component class for the gameBoard abstract to reduce  upon lower
 * sub classes making it more flexible
 *
 * --note
 *
 */
public abstract class GameCharacter {

    public static final int DIE_MAX = 6;
    private final String ROLL_INPUT_ERR = " Invalid Die Roll please re enter";
    public String name = null;
    private int location = 0;
    public String color;
    private int score;



    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    //used to determine returning location on board
    public int getLocation() {
        return location;
    }

    //validation
    @SuppressWarnings("empty-statement")
    public void advanceCharacter(int diceResults) {
        int roll = diceResults;
        if (roll < 0 || roll > DIE_MAX) {

            throw new IllegalArgumentException(ROLL_INPUT_ERR);
        } else {
            setLocation(location + roll);

        };
    }

    public int getScore() {
        return score;
    }

    // declaired abstract because the user char and aichar both set their names diff default name
    //validation done in sub classes
    public abstract void setName(String name);

    // abstract because computerChar has a deafault color of "Lime Green"
    //------validation done in sub classes
    public abstract void setColor(String color);

    //caracters default  score and location are set to zero
    public void setScore(int score) {
        this.score = score;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
