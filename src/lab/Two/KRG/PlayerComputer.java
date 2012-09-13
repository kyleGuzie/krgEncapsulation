/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.Two.KRG;

/**
 *
 * @author Kyle Guzikowski
 * Advanced Java
 *
 *
 * The "PlayerComputer" is designed to let a users play the game alone
 *
 * given that they provide
 * Name, to identify their Character
 * Color, for their Character a character using their name, fav color
 * E-mail, just to know how many people have played the game
 * -future use could be send results, upload results for the database
 *
 * @version 1.0
 * 9-12-12
 */
public class PlayerComputer extends GameCharacter  {

    // varibles declaired final and static because i only want one computer player
    private static final String DEFAULT_NAME = "The Computer";
    private static final String DEFAULT_COLOR= "Lime Green";

     //  Overrode methods because we are using
   //user input also validation before its set to a UserPlayer objects
    @Override
    public void setName(String name) {
        this.name = DEFAULT_NAME;

    }

 //  Overrode methods because we are using
   // set input so no validation needed because no new information user input also validation before its set to a UserPlayer objects
    @Override
    public void setColor(String color) {
        this.color = DEFAULT_COLOR;

    }

}
