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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import commcare.capstone.comcare.biz.DataBiz;

public class HouseVisit implements KvmSerializable {

    Logger LOG = LoggerFactory.getLogger(HouseVisit.class);

    public User assignedTo;
    public boolean completed;
    public boolean completedSpecified;
    public User createdBy;
    public DataCollectionForm dataCollectionForm;
    public String dateCreated;
    public boolean dateCreatedSpecified;
    public long id;
    public boolean idSpecified;
    public Resident resident;
    public String status;
    
    public HouseVisit(){}
    
    public HouseVisit(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("assignedTo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("assignedTo");
            assignedTo =  new User (j);
            
        }
        if (soapObject.hasProperty("completed"))
        {
            Object obj = soapObject.getProperty("completed");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                completed = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                completed = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("completedSpecified"))
        {
            Object obj = soapObject.getProperty("completedSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                completedSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                completedSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("createdBy"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("createdBy");
            createdBy =  new User (j);
            
        }
        if (soapObject.hasProperty("dataCollectionForm"))
        {
            LOG.error("in dataCollectionForm");
            SoapObject j = (SoapObject)soapObject.getProperty("dataCollectionForm");
            if (j != null)
            {
                LOG.error("dataCollectionForm no NULL");
                dataCollectionForm =  new DataCollectionForm (j);
            }
            else
            {
                dataCollectionForm = null;
            }

            
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
        if (soapObject.hasProperty("resident"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("resident");
            resident =  new Resident (j);
            
        }
        if (soapObject.hasProperty("status"))
        {
            Object obj = soapObject.getProperty("status");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                status = j.toString();
            }else if (obj!= null && obj instanceof String){
                status = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return assignedTo;
            case 1:
                return completed;
            case 2:
                return completedSpecified;
            case 3:
                return createdBy;
            case 4:
                return dataCollectionForm;
            case 5:
                return dateCreated;
            case 6:
                return dateCreatedSpecified;
            case 7:
                return id;
            case 8:
                return idSpecified;
            case 9:
                return resident;
            case 10:
                return status;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 11;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = User.class;
                info.name = "assignedTo";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "completed";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "completedSpecified";
                break;
            case 3:
                info.type = User.class;
                info.name = "createdBy";
                break;
            case 4:
                info.type = DataCollectionForm.class;
                info.name = "dataCollectionForm";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateCreated";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateCreatedSpecified";
                break;
            case 7:
                info.type = Long.class;
                info.name = "id";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 9:
                info.type = Resident.class;
                info.name = "resident";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "status";
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
