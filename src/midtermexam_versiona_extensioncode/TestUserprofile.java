/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author aliab
 */
public class TestUserprofile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Select your genres: \n 1. Comedy \n 2. Drama \n 3. Action \n 4. Mystery");
        String genre = in.nextLine();
        UserProfile uP1 = new UserProfile(name, genre);
        System.out.println("Your User profile: "+uP1.getUserID()+", "+uP1.getGenre());
    }
}
