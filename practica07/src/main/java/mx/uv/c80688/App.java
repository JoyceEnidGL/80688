package mx.uv.c80688;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;


/**
 * Hello world!
 *
 */
public class App {

    public static Gson gson = new Gson();
    private static Map <String, Usuario> usuarios =  new HashMap<>();
    public static void main(String[] args) {
        port(80);
        System.out.println("Hello world");
        Usuario u1 = new Usuario("1", "Pedro","1234");
        Usuario u2 = new Usuario("2", "Pablo","5678");

        usuarios.put(u1.getId(), u1);
        usuarios.put(u2.getId(), u2);

        before((req, res)-> res.type("aplication/json") );
        //get("/", (req, res) -> gson.toJson(usuarios));
        //Devolver lista de usuarios
        get("/", (req, res) -> gson.toJson(usuarios) );
        //get("/", (req, res) -> u1);

        post("/", (req, res)->{
            String datosCliente = req.body();
            Usuario u = gson.fromJson(datosCliente, Usuario.class);
            usuarios.put(u.getId(), u);
            return "Listo se ingreso el usuario"+u.getId();
        });

    }
}