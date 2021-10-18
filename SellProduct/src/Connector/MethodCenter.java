/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author 88016
 */
public class MethodCenter {

    public static void showError(Set<String> message) {
        String errors = "<html><body style='color:red;'>" + String.join("<br>", message) + "</body></html>";
        JOptionPane.showMessageDialog(null, errors);
    }

    public static void showSuccess(String message) {
        String html = "<html><body><p style='color:green;'>" + message + "</p></body></html>";
        JOptionPane.showMessageDialog(null, html);
    }

    public static void showSingleError(String message) {
        String html = "<html><body><p style='color:red;'>" + message + "</p></body></html>";
        JOptionPane.showMessageDialog(null, html);
    }


}
