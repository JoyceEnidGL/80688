package mx.uv.c80688;

import javax.print.DocFlavor.STRING;

public class Usuario {
    String id;
    String usuario;
    String password;

    public Usuario(String id, String usuario, String password) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
