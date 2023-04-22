package com.sf.ocs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.ocs.bean.CredentialsBean;
import com.sf.ocs.bean.ProfileBean;
import com.sf.ocs.dao.ProfileDao;


@Service
public class ProfileService {
@Autowired
private ProfileDao adao;
public  String registerUser(CredentialsBean user)
{
	return adao.registerUser(user);
}
public boolean authenticate(CredentialsBean user) 
{
return  adao.authenticate(user);
}
public String addProfile(ProfileBean profileBean) 
{
	return adao.addProfile(profileBean);
}
public ArrayList<ProfileBean> viewProfile()
{
	return adao.viewProfile();
}
public String updateProfile(ProfileBean profileBean)
{
	return adao.updateProfile(profileBean);
}
public String deleteProfile(int userId)
{
	return adao.deleteProfile(userId);
}
public ProfileBean viewProfileById(int userId)
{
	return adao.viewProfileById(userId);
}

}