package GRUPO.LOGICA;


import lombok.*;

import java.util.Scanner;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Administrador extends Usuario implements Permisos {
    @Override
    public String getRol() {
        return "ADMINISTRADOR";
    }

    private String email;


    public void mostrarAdministrador(Administrador administrador){
        System.out.println(administrador.getNombre() + "\t - " + administrador.getCedula() + "\t - " + administrador.getEmail() );
    }
}
