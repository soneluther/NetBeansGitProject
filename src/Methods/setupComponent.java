/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Methods;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author luther
 */
public interface setupComponent {

    static void JDialogCenter(JDialog jDialog) {
        jDialog.pack();
        jDialog.setLocationRelativeTo(null);
        jDialog.setVisible(true);
    }

    static void JFrameCenter(JFrame JFrame) {

        JFrame.pack();
        JFrame.setLocationRelativeTo(null);
        JFrame.setVisible(true);;
    }
}
