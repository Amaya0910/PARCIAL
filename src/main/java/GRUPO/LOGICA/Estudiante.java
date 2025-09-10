package GRUPO.LOGICA;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Estudiante extends Usuario implements Permisos {
    @Override
    public String getRol() {
            return "ESTUDIANTE.";
    }

    private String email;
    private String curso;
    private Date fechaIngreso;



    public void registrar(String nombre, String cedula, String contraseña) {
        setNombre(nombre);
        setCedula(cedula);
        setContraseña(contraseña);


    }

    public void verEstudiante(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIngreso = sdf.format(new Date());
        System.out.println(getNombre() + "\t - " + getCedula() + "\t - " + getEmail() + "\t - " + getCurso() + "\t - " + getFechaIngreso());
    }
}
