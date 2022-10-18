/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author luther
 */
public interface fileIO {
    
    static void readFile(String dir) throws FileNotFoundException{
        File file = new File(dir);
        FileInputStream fis = new FileInputStream(file);
        
        
    }
    
}
