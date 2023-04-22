package com.sf.ocs.dao;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sf.ocs.bean.CredentialsBean;
import com.sf.ocs.bean.LeaveBean;
@Repository
public class ReporterDao{
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query<LeaveBean> q; 
	public  String registerUser(CredentialsBean user)
	{
		System.out.println("Under Dao "+user.getCid()+" "+user.getPassword());
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		return "SUCCESS";
	}
	public boolean authenticate(CredentialsBean user) 
	{
		System.out.println("Under Dao "+user.getCid()+" "+user.getPassword());
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query q3=session.createQuery("from CredentialsBean where cid=:uid and password=:pss");
		q3.setParameter("uid", user.getCid());
		q3.setParameter("pss", user.getPassword());
		ArrayList<CredentialsBean> al=(ArrayList<CredentialsBean>) q3.getResultList();
		int count=0;
		for(CredentialsBean cb:al)
		{
			if((cb.getCid()==(user.getCid()))&&(cb.getPassword().equals(user.getPassword())))
			{
				System.out.println("Record is  present"+cb.getCid()+" "+cb.getPassword());
			
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

	public String addRepoter(LeaveBean leaveBean) 
	{
		System.out.println("Under dao "+leaveBean);
		if(leaveBean!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(leaveBean);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(leaveBean==null)
		{
			System.out.println(leaveBean);
			return "ERROR";
		}
		else
		{
			System.out.println(leaveBean);
			return "FAIL";
		}
	}
	
	public String updateReporter(LeaveBean leaveBean)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(leaveBean!=null)
		{
		session.update(leaveBean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(leaveBean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	public String deleteReporter(int leaveID)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(leaveID>=0)
		{
		Query q1=session.createQuery("delete from LeaveBean where leaveID=:eid");
		q1.setParameter("eid", leaveID);
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
	public ArrayList<LeaveBean> viewReporter()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q=session.createQuery("from LeaveBean");
		return (ArrayList<LeaveBean>) q.list();
	}
	public LeaveBean viewReporterById(int leaveID)
	{
		LeaveBean elBean=new LeaveBean();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<LeaveBean> q2=session.createQuery("from LeaveBean where leaveID=:did");
	q2.setParameter("did", leaveID);
	ArrayList<LeaveBean> all=(ArrayList<LeaveBean>) q2.getResultList();
	for(LeaveBean e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}
}