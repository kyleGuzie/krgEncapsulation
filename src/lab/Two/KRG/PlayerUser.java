/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.Two.KRG;

/**
 *
 *PlayerUser-
 * concrete sub-class  and designed using Input from the user
 *
 * @param
 * properties and methods from the Abstract Super Class GameCharacter Class
 * fields and methods are inherit
 * can be instantiated for game play
 *  in addition it asks for the users e-mail for game usage stats
 *
 * @author Kyle Guzikowski
 * The "PlayerUser" is designed to let users to play the game with a custom Character .
 * given that they provide
 * Name- to identify their Character
 * Color- for game piece
 * E-mail- game stars
 * -future use could be send results, upload results for the database
 *
 *
 */
public class PlayerUser extends GameCharacter {

    private String userEmail;
    private static final String NAME_MSG = "Please enter valid name";
    private static final String COLOR_MSG = "Please re-enter color choice, INVALID";
    private static final int INPUT_MAX = 50;

public PlayerUser(String nme, String color){
        this.name = nme;
        this.color = color;
    }

    //default constructor
    //  newname, color
    public PlayerUser() {
        //
    }

    // unique consturctor for Player user class that uses email input from user
public PlayerUser(String nme, String color, String mail){
        this.name = nme;
        this.color = color;
        this.userEmail = mail;
    }

    //  Overrode methods because we are using
   //user input also validation before its set to a UserPlayer objects name
    // below is cade that needs validation because its comming from user input and users can make mistakes

    @Override
    public void setName(String name) {
        if (name == null || name.length() >= INPUT_MAX) {
            throw new IllegalArgumentException(COLOR_MSG);
        }
        this.name = name;
    }
 //  Overrode methods because we are using
   //user input also validation before its set to a UserPlayer objects  color
    //validation used check for "null"  and just limiting input
    @Override
    public void setColor(String color) {
        if (color == null || color.length() >= INPUT_MAX) {
            throw new IllegalArgumentException(NAME_MSG);
        }
        this.color = color;
    }

    // is a unique method for this class it gathers info about whos playing games
    //linked up to

    //email validation simple but all user emails end with a ".com"
    //private static final String EMAIL_ENDING = ".com";


    public void setUserEmail(String userEmal) {
        if (userEmail == null || userEmal.length() == 0) {
            throw new IllegalArgumentException(NAME_MSG);
        } this.userEmail = userEmal;
 }
   public String getUserEmail() {

        return this.userEmail;
    }
}
