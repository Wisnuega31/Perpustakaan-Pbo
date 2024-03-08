/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author Wisnuega
 */
public class Admin {
    int id;
    static String username;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Admin.username = username;
    }
}
