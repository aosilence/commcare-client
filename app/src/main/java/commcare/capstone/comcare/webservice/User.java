package commcare.capstone.comcare.webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 10/15/2017 3:39:54 PM
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
import java.util.Set;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class User implements KvmSerializable {
    
    public boolean deleted;
    public boolean deletedSpecified;
    public String email;
    public String fullName;
    public long id;
    public boolean idSpecified;
    public String login;
    public String password;
    public String role;
    public long token;
    public boolean tokenSpecified;
    public Set userAudit;
    
    public User(){}
    
    public User(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("deleted"))
        {
            Object obj = soapObject.getProperty("deleted");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                deleted = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                deleted = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("deletedSpecified"))
        {
            Object obj = soapObject.getProperty("deletedSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                deletedSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                deletedSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("email"))
        {
            Object obj = soapObject.getProperty("email");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                email = j.toString();
            }else if (obj!= null && obj instanceof String){
                email = (String) obj;
            }
        }
        if (soapObject.hasProperty("fullName"))
        {
            Object obj = soapObject.getProperty("fullName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fullName = j.toString();
            }else if (obj!= null && obj instanceof String){
                fullName = (String) obj;
            }
        }
        if (soapObject.hasProperty("id"))
        {
            Object obj = soapObject.getProperty("id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                id = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                id = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("idSpecified"))
        {
            Object obj = soapObject.getProperty("idSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                idSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("login"))
        {
            Object obj = soapObject.getProperty("login");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                login = j.toString();
            }else if (obj!= null && obj instanceof String){
                login = (String) obj;
            }
        }
        if (soapObject.hasProperty("password"))
        {
            Object obj = soapObject.getProperty("password");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                password = j.toString();
            }else if (obj!= null && obj instanceof String){
                password = (String) obj;
            }
        }
        if (soapObject.hasProperty("role"))
        {
            Object obj = soapObject.getProperty("role");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                role = j.toString();
            }else if (obj!= null && obj instanceof String){
                role = (String) obj;
            }
        }
        if (soapObject.hasProperty("token"))
        {
            Object obj = soapObject.getProperty("token");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                token = Long.parseLong(j.toString());
            }else if (obj!= null && obj instanceof Number){
                token = (Long) obj;
            }
        }
        if (soapObject.hasProperty("tokenSpecified"))
        {
            Object obj = soapObject.getProperty("tokenSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                tokenSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                tokenSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("userAudit"))
        {
            
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return deleted;
            case 1:
                return deletedSpecified;
            case 2:
                return email;
            case 3:
                return fullName;
            case 4:
                return id;
            case 5:
                return idSpecified;
            case 6:
                return login;
            case 7:
                return password;
            case 8:
                return role;
            case 9:
                return token;
            case 10:
                return tokenSpecified;
            case 11:
                return userAudit;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 12;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "deleted";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "deletedSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "email";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fullName";
                break;
            case 4:
                info.type = Long.class;
                info.name = "id";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "login";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "password";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "role";
                break;
            case 9:
                info.type = Long.class;
                info.name = "token";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "tokenSpecified";
                break;
            case 11:
                info.type = Set.class;
                info.name = "userAudit";
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
