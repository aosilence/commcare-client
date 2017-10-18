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

public class Resident implements KvmSerializable {
    
    public String address;
    public String age;
    public String ctcNumber;
    public String dob;
    public String fullName;
    public String highestEducation;
    public String householdIncome;
    public String householdMember;
    public long id;
    public boolean idSpecified;
    public String maritalStatus;
    public String nationality;
    public String nric;
    public String occupation;
    public String race;
    public String religion;
    public String sex;
    public String spokenLanguage;
    public String typeOfFlat;
    public String vehOwner;
    
    public Resident(){}
    
    public Resident(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("address"))
        {
            Object obj = soapObject.getProperty("address");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                address = j.toString();
            }else if (obj!= null && obj instanceof String){
                address = (String) obj;
            }
        }
        if (soapObject.hasProperty("age"))
        {
            Object obj = soapObject.getProperty("age");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                age = j.toString();
            }else if (obj!= null && obj instanceof String){
                age = (String) obj;
            }
        }
        if (soapObject.hasProperty("ctcNumber"))
        {
            Object obj = soapObject.getProperty("ctcNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ctcNumber = j.toString();
            }else if (obj!= null && obj instanceof String){
                ctcNumber = (String) obj;
            }
        }
        if (soapObject.hasProperty("dob"))
        {
            Object obj = soapObject.getProperty("dob");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dob = j.toString();
            }else if (obj!= null && obj instanceof String){
                dob = (String) obj;
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
        if (soapObject.hasProperty("highestEducation"))
        {
            Object obj = soapObject.getProperty("highestEducation");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                highestEducation = j.toString();
            }else if (obj!= null && obj instanceof String){
                highestEducation = (String) obj;
            }
        }
        if (soapObject.hasProperty("householdIncome"))
        {
            Object obj = soapObject.getProperty("householdIncome");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                householdIncome = j.toString();
            }else if (obj!= null && obj instanceof String){
                householdIncome = (String) obj;
            }
        }
        if (soapObject.hasProperty("householdMember"))
        {
            Object obj = soapObject.getProperty("householdMember");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                householdMember = j.toString();
            }else if (obj!= null && obj instanceof String){
                householdMember = (String) obj;
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
        if (soapObject.hasProperty("maritalStatus"))
        {
            Object obj = soapObject.getProperty("maritalStatus");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maritalStatus = j.toString();
            }else if (obj!= null && obj instanceof String){
                maritalStatus = (String) obj;
            }
        }
        if (soapObject.hasProperty("nationality"))
        {
            Object obj = soapObject.getProperty("nationality");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nationality = j.toString();
            }else if (obj!= null && obj instanceof String){
                nationality = (String) obj;
            }
        }
        if (soapObject.hasProperty("nric"))
        {
            Object obj = soapObject.getProperty("nric");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                nric = j.toString();
            }else if (obj!= null && obj instanceof String){
                nric = (String) obj;
            }
        }
        if (soapObject.hasProperty("occupation"))
        {
            Object obj = soapObject.getProperty("occupation");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                occupation = j.toString();
            }else if (obj!= null && obj instanceof String){
                occupation = (String) obj;
            }
        }
        if (soapObject.hasProperty("race"))
        {
            Object obj = soapObject.getProperty("race");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                race = j.toString();
            }else if (obj!= null && obj instanceof String){
                race = (String) obj;
            }
        }
        if (soapObject.hasProperty("religion"))
        {
            Object obj = soapObject.getProperty("religion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                religion = j.toString();
            }else if (obj!= null && obj instanceof String){
                religion = (String) obj;
            }
        }
        if (soapObject.hasProperty("sex"))
        {
            Object obj = soapObject.getProperty("sex");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                sex = j.toString();
            }else if (obj!= null && obj instanceof String){
                sex = (String) obj;
            }
        }
        if (soapObject.hasProperty("spokenLanguage"))
        {
            Object obj = soapObject.getProperty("spokenLanguage");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                spokenLanguage = j.toString();
            }else if (obj!= null && obj instanceof String){
                spokenLanguage = (String) obj;
            }
        }
        if (soapObject.hasProperty("typeOfFlat"))
        {
            Object obj = soapObject.getProperty("typeOfFlat");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                typeOfFlat = j.toString();
            }else if (obj!= null && obj instanceof String){
                typeOfFlat = (String) obj;
            }
        }
        if (soapObject.hasProperty("vehOwner"))
        {
            Object obj = soapObject.getProperty("vehOwner");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                vehOwner = j.toString();
            }else if (obj!= null && obj instanceof String){
                vehOwner = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return address;
            case 1:
                return age;
            case 2:
                return ctcNumber;
            case 3:
                return dob;
            case 4:
                return fullName;
            case 5:
                return highestEducation;
            case 6:
                return householdIncome;
            case 7:
                return householdMember;
            case 8:
                return id;
            case 9:
                return idSpecified;
            case 10:
                return maritalStatus;
            case 11:
                return nationality;
            case 12:
                return nric;
            case 13:
                return occupation;
            case 14:
                return race;
            case 15:
                return religion;
            case 16:
                return sex;
            case 17:
                return spokenLanguage;
            case 18:
                return typeOfFlat;
            case 19:
                return vehOwner;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 20;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "address";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "age";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ctcNumber";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dob";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fullName";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "highestEducation";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "householdIncome";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "householdMember";
                break;
            case 8:
                info.type = Long.class;
                info.name = "id";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "idSpecified";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "maritalStatus";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "nationality";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "nric";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "occupation";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "race";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "religion";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "sex";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "spokenLanguage";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "typeOfFlat";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "vehOwner";
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