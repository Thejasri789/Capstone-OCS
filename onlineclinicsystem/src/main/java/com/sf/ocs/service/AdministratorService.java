package com.sf.ocs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.ocs.bean.ProfileBean;
import com.sf.ocs.bean.CredentialsBean;
import com.sf.ocs.bean.DoctorBean;
import com.sf.ocs.dao.AdministratorDao;

@Service
public class AdministratorService {
@Autowired
private AdministratorDao adao;
public  String registerUser(CredentialsBean cb)
{
	return adao.registerUser(cb);
}
public boolean authenticate(CredentialsBean cb) 
{
return  adao.authenticate(cb);
}
public String addDoctor(DoctorBean doctorBean) 
{
	return adao.addDoctor(doctorBean);
}
public ArrayList<DoctorBean> viewDoctor()
{
	return adao.viewDoctor();
}
public String updateDoctor(DoctorBean doctorBean)
{
	return adao.updateDoctor(doctorBean);
}
public String deleteDoctor(int doctorId)
{
	return adao.deleteDoctor(doctorId);
}
public DoctorBean viewDoctorById(int doctorId)
{
	return adao.viewDoctorById(doctorId);
}

}
