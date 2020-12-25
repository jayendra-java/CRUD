package com.grocery.configirations;

import java.util.Properties;

import javax.sql.*;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SessionFactoryConfigr {
	private static SessionFactory sessionFactory;
	 private static StandardServiceRegistry standardServiceRegistry;
	  
	  public static SessionFactory getSessionFactory()
	  {
		  System.out.println("hello static block");
		    if (sessionFactory == null) {
		      try {
		        // Create StandardServiceRegistry
		        standardServiceRegistry = new StandardServiceRegistryBuilder()
		            .configure()
		            .build();
		        // Create MetadataSources
		        MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
		        // Create Metadata
		        Metadata metadata = metadataSources.getMetadataBuilder().build();
		        // Create SessionFactory
		        sessionFactory = metadata.getSessionFactoryBuilder().build();
				  System.out.println("hello static block---2");

		      } catch (Exception e) {
		        e.printStackTrace();
		        if (standardServiceRegistry != null) {
		          StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
		        }
		      }
		    }
	  
		  if(sessionFactory!=null)
		  {
			  System.out.println("sucess session object created");
		  }
		  else
		  {
			  System.out.println("fail");
		  }
		  return sessionFactory;
	  }
	  
}
