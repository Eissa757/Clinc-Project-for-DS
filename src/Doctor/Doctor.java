/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

import Utilty.Person;

/**
 *
 * @author ameen
 */
public class Doctor extends Person{
    private String qualfication;
    private String hiredDate;
    public Doctor()
    {
        super();
    }
  public Doctor(int id, String name, String address,String qualfication, String hiredDate) {
        super(id, name, address);
        this.qualfication = qualfication;
        this.hiredDate = hiredDate;
    }

    public String getQualfication() {
        return qualfication;
    }

    public void setQualfication(String qualfication) {
        this.qualfication = qualfication;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        System.out.println( super.toString()+"Doctor{" + "qualfication=" + qualfication + ", hiredDate=" + hiredDate + '}');
          
        return null;
    }
   
    
    }
  
    

