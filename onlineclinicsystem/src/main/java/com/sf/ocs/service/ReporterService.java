package com.sf.ocs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.ocs.bean.CredentialsBean;
import com.sf.ocs.bean.LeaveBean;
import com.sf.ocs.dao.ReporterDao;


@Service
public class ReporterService {
@Autowired
private ReporterDao  adao;
public  String registerUser(CredentialsBean user)
{
	return adao.registerUser(user);
}
public boolean authenticate(CredentialsBean user) 
{
return  adao.authenticate(user);
}
public String addReporter(LeaveBean leaveBean) 
{
	return adao.addRepoter(leaveBean);
}
public ArrayList<LeaveBean> viewReporter()
{
	return adao.viewReporter();
}
public String updateReporter(LeaveBean reporterBean)
{
	return adao.updateReporter(reporterBean);
}
public String deleteReporter(int leaveID)
{
	return adao.deleteReporter(leaveID);
}
public LeaveBean viewReporterById(int leaveID)
{
	return adao.viewReporterById(leaveID);
}

}