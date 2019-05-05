/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;

/**
 *
 * @author Doramas Báez Bernal
 * @version 1.0
 */
public class Kata1 {

    
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1998,9,12);
        Person person = new Person("Doramas",date );
        System.out.println(person.getName() + " tiene :" + person.getAge()
                           + " años");
    }
    
}
