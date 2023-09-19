
import entities.Course;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class MainEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course course = new Course();
        try {
            System.out.println(course.getArray()[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(Exception e) {
            System.out.println("Exception");
        }
        
    }
    
}
