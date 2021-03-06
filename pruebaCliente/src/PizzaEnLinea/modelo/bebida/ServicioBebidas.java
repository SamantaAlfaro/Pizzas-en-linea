
package PizzaEnLinea.modelo.bebida;

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
@WebService(name = "ServicioBebidas", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioBebidas {


    /**
     * 
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteDrink", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.DeleteDrink")
    @ResponseWrapper(localName = "deleteDrinkResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.DeleteDrinkResponse")
    @Action(input = "http://servicios/ServicioBebidas/deleteDrinkRequest", output = "http://servicios/ServicioBebidas/deleteDrinkResponse")
    public String deleteDrink(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre);

    /**
     * 
     * @param precio
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertDrink", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.InsertDrink")
    @ResponseWrapper(localName = "insertDrinkResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.InsertDrinkResponse")
    @Action(input = "http://servicios/ServicioBebidas/insertDrinkRequest", output = "http://servicios/ServicioBebidas/insertDrinkResponse")
    public String insertDrink(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "precio", targetNamespace = "")
        String precio);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listDrinks", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.ListDrinks")
    @ResponseWrapper(localName = "listDrinksResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.ListDrinksResponse")
    @Action(input = "http://servicios/ServicioBebidas/listDrinksRequest", output = "http://servicios/ServicioBebidas/listDrinksResponse")
    public String listDrinks();

    /**
     * 
     * @param nombre
     * @param value
     * @param campo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateDrink", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.UpdateDrink")
    @ResponseWrapper(localName = "updateDrinkResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.UpdateDrinkResponse")
    @Action(input = "http://servicios/ServicioBebidas/updateDrinkRequest", output = "http://servicios/ServicioBebidas/updateDrinkResponse")
    public String updateDrink(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "campo", targetNamespace = "")
        String campo,
        @WebParam(name = "value", targetNamespace = "")
        String value);

    /**
     * 
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDrink", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.GetDrink")
    @ResponseWrapper(localName = "getDrinkResponse", targetNamespace = "http://servicios/", className = "PizzaEnLinea.modelo.bebida.GetDrinkResponse")
    @Action(input = "http://servicios/ServicioBebidas/getDrinkRequest", output = "http://servicios/ServicioBebidas/getDrinkResponse")
    public String getDrink(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre);

}
