package mx.uv.c80688;
import static spark.Spark.*;
import org.eclipse.jetty.websocket.api.StatusCode;
import com.google.gson.JsonObject;
import spark.QueryParamsMap;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        System.out.println( "Hello World!" );
        get("/aaron", (req, res) -> "Hello Aaron");
        get("/omar", (req, res) -> "Hello Omar");
        get("/eduardo", (req, res) -> "Hello Eduardo");
        get("/", (req, res) -> "<h1>Hola Sistemas Web</h1><img src='https://www.uv.mx/v2/images/logouv.jpg'>");
        post("/", (req,res)->{
            System.out.println("login: " + req.queryParams(queryParam:"login") );
            System.out.println("contraseña: " + req.queryParams(queryParam:"password") );
            String usuario = req.queryParams(queryParam: "login");
            
            JsonObject respuesta = new JsonObject();
            respuesta.addProperty("msj", "bienvenido");
            respuesta.addProperty("usuario", usuario);
            
            if(usuario.equals("omar") ){
                res: status(statusCode: 200);
                return "Bienvenido " + usuario;
            }else[
                res.status(statusCode: 400);
                return "Quien eres tu?" + usuario;
            ]
        });
    }
}
