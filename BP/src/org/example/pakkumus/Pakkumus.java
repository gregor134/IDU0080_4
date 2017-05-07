package org.example.pakkumus;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-05-04T23:29:43.228+03:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://www.example.org/pakkumus/", name = "pakkumus")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Pakkumus {

    @WebMethod(action = "http://idu0080.ttu.ee/pakkumus/teePakkumus")
    @WebResult(name = "PakkumusVastus", targetNamespace = "http://www.example.org/pakkumus/", partName = "parameters")
    public PakkumusVastus teePakkumus(
        @WebParam(partName = "parameters", name = "PakkumusParing", targetNamespace = "http://www.example.org/pakkumus/")
        PakkumusParing parameters
    );
}