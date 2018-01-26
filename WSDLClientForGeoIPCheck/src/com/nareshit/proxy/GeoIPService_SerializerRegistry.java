// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nareshit.proxy;

import com.sun.xml.rpc.client.BasicService;
import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.*;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.soap.SOAPVersion;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.rpc.*;
import javax.xml.rpc.encoding.*;
import javax.xml.namespace.QName;

public class GeoIPService_SerializerRegistry implements SerializerConstants {
    public GeoIPService_SerializerRegistry() {
    }
    
    public TypeMappingRegistry getRegistry() {
        
        TypeMappingRegistry registry = BasicService.createStandardTypeMappingRegistry();
        TypeMapping mapping12 = registry.getTypeMapping(SOAP12Constants.NS_SOAP_ENCODING);
        TypeMapping mapping = registry.getTypeMapping(SOAPConstants.NS_SOAP_ENCODING);
        TypeMapping mapping2 = registry.getTypeMapping("");
        {
            QName type = new QName("http://www.webservicex.net/", "GetGeoIPContextResponse");
            CombinedSerializer serializer = new com.nareshit.proxy.GetGeoIPContextResponse_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,com.nareshit.proxy.GetGeoIPContextResponse.class, type, serializer);
        }
        {
            QName type = new QName("http://www.webservicex.net/", "GetGeoIP");
            CombinedSerializer serializer = new com.nareshit.proxy.GetGeoIP_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,com.nareshit.proxy.GetGeoIP.class, type, serializer);
        }
        {
            QName type = new QName("http://www.webservicex.net/", "GetGeoIPContext");
            CombinedSerializer serializer = new com.nareshit.proxy.GetGeoIPContext_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,com.nareshit.proxy.GetGeoIPContext.class, type, serializer);
        }
        {
            QName type = new QName("http://www.webservicex.net/", "GeoIP");
            CombinedSerializer serializer = new com.nareshit.proxy.GeoIP_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,com.nareshit.proxy.GeoIP.class, type, serializer);
        }
        {
            QName type = new QName("http://www.webservicex.net/", "GetGeoIPResponse");
            CombinedSerializer serializer = new com.nareshit.proxy.GetGeoIPResponse_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,com.nareshit.proxy.GetGeoIPResponse.class, type, serializer);
        }
        return registry;
    }
    
    private static void registerSerializer(TypeMapping mapping, java.lang.Class javaType, javax.xml.namespace.QName xmlType,
        Serializer ser) {
        mapping.register(javaType, xmlType, new SingletonSerializerFactory(ser),
            new SingletonDeserializerFactory((Deserializer)ser));
    }
    
}
