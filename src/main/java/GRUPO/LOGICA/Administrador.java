package GRUPO.LOGICA;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Administrador extends Usuario implements Permisos {
    @Override

    public String getRol() {
        return "ADMINISTRADOR.";
    }

    private String email;


    public void mostrarAdministrador(){
        System.out.println(getNombre() + "\t - " + getCedula() + "\t - " + getEmail() );
    }
}
