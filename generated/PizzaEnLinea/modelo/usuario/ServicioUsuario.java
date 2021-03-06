
package PizzaEnLinea.modelo.usuario;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioUsuario", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioUsuario {


    /**
     * 
     * @param cedula
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.GetUserResponse")
    @Action(input = "http://servicios/ServicioUsuario/getUserRequest", output = "http://servicios/ServicioUsuario/getUserResponse")
    public String getUser(
        @WebParam(name = "cedula", targetNamespace = "")
        String cedula);

    /**
     * 
     * @param cedula
     * @param newPass
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePassword", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.UpdatePassword")
    @ResponseWrapper(localName = "updatePasswordResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.UpdatePasswordResponse")
    @Action(input = "http://servicios/ServicioUsuario/updatePasswordRequest", output = "http://servicios/ServicioUsuario/updatePasswordResponse")
    public String updatePassword(
        @WebParam(name = "cedula", targetNamespace = "")
        String cedula,
        @WebParam(name = "newPass", targetNamespace = "")
        String newPass);

    /**
     * 
     * @param apellidos
     * @param cedula
     * @param direccion
     * @param telefono
     * @param nombre
     * @param rol
     * @param contraseņa
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertUser", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.InsertUser")
    @ResponseWrapper(localName = "insertUserResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.InsertUserResponse")
    @Action(input = "http://servicios/ServicioUsuario/insertUserRequest", output = "http://servicios/ServicioUsuario/insertUserResponse")
    public String insertUser(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellidos", targetNamespace = "")
        String apellidos,
        @WebParam(name = "cedula", targetNamespace = "")
        String cedula,
        @WebParam(name = "direccion", targetNamespace = "")
        String direccion,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseņa,
        @WebParam(name = "telefono", targetNamespace = "")
        String telefono,
        @WebParam(name = "rol", targetNamespace = "")
        String rol);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listUser", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.ListUser")
    @ResponseWrapper(localName = "listUserResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.ListUserResponse")
    @Action(input = "http://servicios/ServicioUsuario/listUserRequest", output = "http://servicios/ServicioUsuario/listUserResponse")
    public String listUser();

    /**
     * 
     * @param cedula
     * @param direccion
     * @param telefono
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.usuario.UpdateUserResponse")
    @Action(input = "http://servicios/ServicioUsuario/updateUserRequest", output = "http://servicios/ServicioUsuario/updateUserResponse")
    public String updateUser(
        @WebParam(name = "cedula", targetNamespace = "")
        String cedula,
        @WebParam(name = "direccion", targetNamespace = "")
        String direccion,
        @WebParam(name = "telefono", targetNamespace = "")
        String telefono);

}
