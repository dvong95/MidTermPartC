/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name = "";
        String favouriteGenre = "";
        
        System.out.print("Please enter your name: ");
        name = input.next();
        System.out.print(
                "Please choose your favourite movie genre "
                        + "(Comedy, Drama, Action, Mystery): ");
        favouriteGenre = input.next();
        
        UserProfile userProfile = new UserProfile(name, favouriteGenre);
        
        System.out.println("User profile was created.");
    }
}
