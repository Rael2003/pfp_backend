package com.mycompany.pfp.services;

public class Usuario {
    public static boolean validarUsuario(String login, String senha){
        
        if(login.equals("adm") && senha.equals("adm")){
            return true;
        }
        return false;
        
    }
}
