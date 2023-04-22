package com.sf.ocs.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sf.ocs.bean.CredentialsBean;
import com.sf.ocs.bean.DoctorBean;
import com.sf.ocs.bean.ProfileBean;
@Repository
public class AdministratorDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query<DoctorBean> q; 
	public  String registerUser(CredentialsBean  cb)
	{
		System.out.println("Under Dao "+cb.getCid()+" "+cb.getPassword());
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.save(cb);
		transaction.commit();
		session.close();
		return "SUCCESS";
	}
	public boolean authenticate(CredentialsBean cb2) 
	{
		System.out.println("Under Dao "+cb2.getCid()+" "+cb2.getPassword());
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query q3=session.createQuery("from ProfileBean where userID=:uid and password=:pss");
		q3.setParameter("uid", cb2.getCid());
		q3.setParameter("pss", cb2.getPassword());
		ArrayList<ProfileBean> al=(ArrayList<ProfileBean>) q3.getResultList();
		int count=0;
		for(ProfileBean cb:al)
		{
			if((cb.getUserID()==(cb2.getCid()))&&(cb.getPassword().equals(cb2.getPassword())))
			{
				System.out.println(cb);
				System.out.println("Record is  present"+cb.getUserID()+" "+cb.getPassword());
				count++;
				if(count>0)
				{
		return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
		
	}

	public String addDoctor(DoctorBean doctorBean) 
	{
		if(doctorBean!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(doctorBean);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(doctorBean==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public String updateDoctor(DoctorBean doctorBean)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(doctorBean!=null)
		{
		session.update(doctorBean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(doctorBean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	public String deleteDoctor(int doctorId)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(doctorId>=0)
		{
		Query q1=session.createQuery("delete from DoctorBean where doctorID=:eid");
		q1.setParameter("eid", doctorId);
		q1.executeUpdate();
transaction.commit();
session.close();
		return "SUCCESS";
		}
		else
		{
			return "FAIL";
		}
	}
	public ArrayList<DoctorBean> viewDoctor()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q=session.createQuery("from DoctorBean");
		return (ArrayList<DoctorBean>) q.list();
	}
	public DoctorBean viewDoctorById(int doctorId)
	{
		DoctorBean elBean=new DoctorBean();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<DoctorBean> q2=session.createQuery("from DoctorBean where doctorID=:eid");
	q2.setParameter("eid", doctorId);
	ArrayList<DoctorBean> all=(ArrayList<DoctorBean>) q2.getResultList();
	for(DoctorBean e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}
	public boolean authenticate1(CredentialsBean cb) {
		// TODO Auto-generated method stub
		return false;
	}
}
