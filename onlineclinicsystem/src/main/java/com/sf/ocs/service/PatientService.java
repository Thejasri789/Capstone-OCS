package com.sf.ocs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.ocs.bean.ProfileBean;
import com.sf.ocs.bean.CredentialsBean;
import com.sf.ocs.bean.PatientBean;
import com.sf.ocs.dao.PatientDao;

@Service
public class PatientService {
@Autowired
private PatientDao adao;
public  String registerUser(CredentialsBean cb)
{
	return adao.registerUser(cb);
}
public boolean authenticate(CredentialsBean cb) 
{
return  adao.authenticate(cb);
}
public String addPatient(PatientBean patientBean) 
{
	return adao.addPatient(patientBean);
	
}
public ArrayList<PatientBean> viewPatient()
{
	return adao.viewPatient();
}
public String updatePatient(PatientBean patientBean)
{
	return adao.updatePatient(patientBean);
}
public String deletePatient(int patientId)
{
	return adao.deletePatient(patientId);
}
public PatientBean viewPatientById(int patientId)
{
	return adao.viewPatientById(patientId);
}
public void addProfile(ProfileBean eb) {
	// TODO Auto-generated method stub
	
}

}
