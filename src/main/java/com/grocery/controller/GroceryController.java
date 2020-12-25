package com.grocery.controller;

import java.util.*;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grocery.configirations.SessionFactoryConfigr;
import com.grocery.model.*;
import com.mysql.cj.xdevapi.SessionFactory;

@Controller
public class GroceryController {
	org.hibernate.SessionFactory sf=SessionFactoryConfigr.getSessionFactory();
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView  save(Model m)
	{
		
		return new ModelAndView ("index");
	}
	@RequestMapping("/save")
	public String saveproduct(@RequestParam String[] name,@RequestParam String quantity[],
			@RequestParam String price[],@RequestParam String customerid,
			@RequestParam String customername,
			@RequestParam String phonenumber,@RequestParam String billingdate)
	{
		int totalprice=0;
		for(int i=0;i<=price.length-1;i++)
		{
			int quantity1=Integer.parseInt(quantity[i]);
			int price1=Integer.parseInt(price[i]);
			totalprice+=price1*quantity1;
			
		}
		System.out.println(totalprice);
		Customer c=new Customer();
		c.setCustomerid(customerid);
		c.setName(customername);
		c.setNumber(phonenumber);
		c.setDate(billingdate);
		c.setTotalcost(totalprice);
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		s.save(c);
		for(int i=0;i<=name.length-1;i++)
		{
			Product p=new Product();
			p.setCustomerid(customerid);
			p.setName(name[i]);
			p.setPrice(price[i]);
			p.setQuantity(quantity[i]);
			s.save(p);
		}
		tx.commit();
		return "Grocerysearch";
	}
	@RequestMapping("/search")
	public String search(@RequestParam String customerid,
	@RequestParam String customername,@RequestParam String productname,
	Model m)
	{
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		//product info
		String sql="select pr from Product pr where pr.name=:name and pr.customerid=:customerid";
		Query q=s.createQuery(sql);
		q.setParameter("name", productname);
		q.setParameter("customerid", customerid);
		Product p= (Product) q.setMaxResults(1).getSingleResult();
		System.out.println(p);
		//customerinfo
		String sql1="select cr from Customer cr where cr.name=:name and cr.customerid=:customerid";
		Query q1=s.createQuery(sql1);
		q1.setParameter("name", customername);
		q1.setParameter("customerid", customerid);
		Customer cr= (Customer) q1.setMaxResults(1).getSingleResult();
		System.out.println(cr);
		
		m.addAttribute("customer", cr);
		m.addAttribute("product", p);
		return "search";
	}
	@RequestMapping("/delete/{id}")
	public String delet(@PathVariable String id)
	{
		//delete operation
		System.out.println("id id"+id);
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		String sql="delete from Product where id=:id";  
		Query q=s.createQuery(sql);
		q.setParameter("id", id);
		q.executeUpdate();
		
		return "redirect:/Grocerylist";
	}
	@RequestMapping("/Grocerylist")
	public String viewgrocey() {
		
		return "Grocerylist";
	}
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id,Model m)
	{
		//update operation
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		System.out.println("=====id is"+id);
		if(id!=null)
		{
		Product p=s.get(Product.class, id);
		tx.commit();
		System.out.println("===========");
		System.out.println(p);
		System.out.println("============");
		m.addAttribute("product", p);
		}
		else {
			System.out.println("no id there");
		}
		return "Groceryedit";
		
	}
	@RequestMapping("edit/editsave")
	public String saveeditproduct(@RequestParam String name,@RequestParam String quantity,
			@RequestParam String price,@RequestParam String customerid,@RequestParam String id)
	{
		System.out.println("hello");
		System.out.println("hello======");
		System.out.println("hello======");
		System.out.println("hello======");

		Product p=new Product();
		p.setId(id);
		p.setCustomerid(customerid);
		p.setName(name);
		p.setPrice(price);
		p.setQuantity(quantity);
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		//update table
		s.update(p);
		tx.commit();
		//s.saveOrUpdate(pr);
		return "redirect:/Grocerylist";
	}
	
	
//@RequestParam String name,@RequestParam String quantity,
//	@RequestParam String price,@RequestParam String id
}
