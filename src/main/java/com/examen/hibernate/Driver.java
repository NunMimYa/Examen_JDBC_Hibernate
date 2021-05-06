package com.examen.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.examen.hibernate.entities.Artiste;
import com.examen.hibernate.entities.Disque;
import com.examen.hibernate.entities.Label;

public class Driver {
	private final static Session s = HibernateUtils.getSession();

	public static void main(String[] args) {

		Initialisation();

		s.close();
	}

	private static void Initialisation() {
		System.out.println("------ Initialisation -> OK  ------");

		Artiste a = new Artiste(null, "name1", "nationality1");
		Artiste b = new Artiste(null, "name2", "nationality2");
		Artiste c = new Artiste(null, "name3", "nationality3");

		Disque d = new Disque(null, "name1", "style1");
		Disque e = new Disque(null, "name2", "style2");
		Disque f = new Disque(null, "name3", "style3");
		
		Label g = new Label(null, "name1", "nationality1");
		Label h = new Label(null, "name2", "nationality2");
		Label i = new Label(null, "name3", "nationality3");

		Transaction tx = s.beginTransaction();

		s.persist(a);
		s.persist(b);
		s.persist(c);
		s.persist(d);
		s.persist(e);
		s.persist(f);
		s.persist(g);
		s.persist(h);
		s.persist(i);
		tx.commit();
    }
}
