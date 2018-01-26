// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nareshit.proxy;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class GetGeoIPResponse_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final javax.xml.namespace.QName ns1_GetGeoIPResult_QNAME = new QName("http://www.webservicex.net/", "GetGeoIPResult");
    private static final javax.xml.namespace.QName ns1_GeoIP_TYPE_QNAME = new QName("http://www.webservicex.net/", "GeoIP");
    private CombinedSerializer ns1_myGeoIP_LiteralSerializer;
    
    public GetGeoIPResponse_LiteralSerializer(javax.xml.namespace.QName type, java.lang.String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public GetGeoIPResponse_LiteralSerializer(javax.xml.namespace.QName type, java.lang.String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns1_myGeoIP_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.nareshit.proxy.GeoIP.class, ns1_GeoIP_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        com.nareshit.proxy.GetGeoIPResponse instance = new com.nareshit.proxy.GetGeoIPResponse();
        java.lang.Object member=null;
        javax.xml.namespace.QName elementName;
        java.util.List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_GetGeoIPResult_QNAME)) {
                member = ns1_myGeoIP_LiteralSerializer.deserialize(ns1_GetGeoIPResult_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setGetGeoIPResult((com.nareshit.proxy.GeoIP)member);
                reader.nextElementContent();
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (java.lang.Object)instance;
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.nareshit.proxy.GetGeoIPResponse instance = (com.nareshit.proxy.GetGeoIPResponse)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.nareshit.proxy.GetGeoIPResponse instance = (com.nareshit.proxy.GetGeoIPResponse)obj;
        
        if (instance.getGetGeoIPResult() != null) {
            ns1_myGeoIP_LiteralSerializer.serialize(instance.getGetGeoIPResult(), ns1_GetGeoIPResult_QNAME, null, writer, context);
        }
    }
}
