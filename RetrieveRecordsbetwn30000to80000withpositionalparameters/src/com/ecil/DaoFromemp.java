package com.ecil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class DaoFromemp 
{

public static void main(String[] args)

{
Session session = HibernateUtility.getSession();
Query query = session.createQuery("from com.ecil.Employee where employeeSalary >? and employeeSalary<=?");

query.setParameter(0, 30000d);
query.setParameter(1,80000d);
List list = query.getResultList();

/**
 * size of the objects inthe entire table is 10,1 row in table  consider as one object
 */

System.out.println(list.size());
for (Object object : list) 

{
	Employee employee=(Employee)object;
	System.out.println(employee.getEmployeeNumber());
	System.out.println(employee.getName());
	System.out.println(employee.getEmployeeSalary());
	
}
session.close();
}
}
