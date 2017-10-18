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
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class DataCollectionForm implements KvmSerializable {
    
    public String gRLStaffContact;
    public String gRLStaffName;
    public Assistances assistances;
    public String dateCreated;
    public boolean dateCreatedSpecified;
    public User doneBy;
    public String duration;
    public String endorsedBy;
    public String filePath;
    public long id;
    public boolean idSpecified;
    public Issues issues;
    public Resident resident;
    
    public DataCollectionForm(){}
    
    public DataCollectionForm(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("GRLStaffContact"))
        {
            Object obj = soapObject.getProperty("GRLStaffContact");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                gRLStaffContact = j.toString();
            }else if (obj!= null && obj instanceof String){
                gRLStaffContact = (String) obj;
            }
        }
        if (soapObject.hasProperty("GRLStaffName"))
        {
            Object obj = soapObject.getProperty("GRLStaffName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                gRLStaffName = j.toString();
            }else if (obj!= null && obj instanceof String){
                gRLStaffName = (String) obj;
            }
        }
        if (soapObject.hasProperty("assistances"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("assistances");
            assistances =  new Assistances (j);
            
        }
        if (soapObject.hasProperty("dateCreated"))
        {
            Object obj = soapObject.getProperty("dateCreated");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateCreated = j.toString();
            }else if (obj!= null && obj instanceof String){
                dateCreated = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateCreatedSpecified"))
        {
            Object obj = soapObject.getProperty("dateCreatedSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateCreatedSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dateCreatedSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("doneBy"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("doneBy");
            doneBy =  new User (j);
            
        }
        if (soapObject.hasProperty("duration"))
        {
            Object obj = soapObject.getProperty("duration");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                duration = j.toString();
            }else if (obj!= null && obj instanceof String){
                duration = (String) obj;
            }
        }
        if (soapObject.hasProperty("endorsedBy"))
        {
            Object obj = soapObject.getProperty("endorsedBy");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                endorsedBy = j.toString();
            }else if (obj!= null && obj instanceof String){
                endorsedBy = (String) obj;
            }
        }
        if (soapObject.hasProperty("filePath"))
        {
            Object obj = soapObject.getProperty("filePath");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                filePath = j.toString();
            }else if (obj!= null && obj instanceof String){
                filePath = (String) obj;
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
        if (soapObject.hasProperty("issues"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("issues");
            issues =  new Issues (j);
            
        }
        if (soapObject.hasProperty("resident"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("resident");
            resident =  new Resident (j);
            
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return gRLStaffContact;
            case 1:
                return gRLStaffName;
            case 2:
                return assistances;
            case 3:
                return dateCreated;
            case 4:
                return dateCreatedSpecified;
            case 5:
                return doneBy;
            case 6:
                return duration;
            case 7:
                return endorsedBy;
            case 8:
                return filePath;
            case 9:
                return id;
            case 10:
                return idSpecified;
            case 11:
                return issues;
            case 12:
                return resident;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 13;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "GRLStaffContact";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "GRLStaffName";
                break;
            case 2:
                info.type = Assistances.class;
                info.name = "assistances";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateCreated";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateCreatedSpecified";
                break;
            case 5:
                info.type = User.class;
                info.name = "doneBy";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "duration";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "endorsedBy";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "filePath";
                break;
            case 9:
                info.type = Long.class;
                info.name = "id";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 11:
                info.type = Issues.class;
                info.name = "issues";
                break;
            case 12:
                info.type = Resident.class;
                info.name = "resident";
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
