package commcare.capstone.comcare.webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 10/6/2017 10:03:52 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class BaseResponse implements KvmSerializable {
    
    public String interfaceVersion;
    public String responseDate;
    public boolean responseDateSpecified;
    
    public BaseResponse(){}
    
    public BaseResponse(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("interfaceVersion"))
        {
            Object obj = soapObject.getProperty("interfaceVersion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                interfaceVersion = j.toString();
            }else if (obj!= null && obj instanceof String){
                interfaceVersion = (String) obj;
            }
        }
        if (soapObject.hasProperty("responseDate"))
        {
            Object obj = soapObject.getProperty("responseDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                responseDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                responseDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("responseDateSpecified"))
        {
            Object obj = soapObject.getProperty("responseDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                responseDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                responseDateSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return interfaceVersion;
            case 1:
                return responseDate;
            case 2:
                return responseDateSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 3;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "interfaceVersion";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "responseDate";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "responseDateSpecified";
                break;
        }
    }
    
    @Override
    public String getInnerText() {
        return null;
    }
    
    
    @Override
    public void setInnerText(String s) {
    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
