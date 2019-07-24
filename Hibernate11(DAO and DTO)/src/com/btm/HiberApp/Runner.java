package com.btm.HiberApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.btm.HiberApp.StateDAO.LibraryDao;
import com.btm.HiberApp.StateDTO.BookDTO;
import com.btm.HiberApp.StateDTO.LibraryDTO;
import com.btm.Jspider.HibernateUtil;

public class Runner {
	public static void main(String[] args) {

		// LibraryDTO marvat=new LibraryDTO();
		/*
		 * marvat.setName("Marvat"); marvat.setLocation("BTM");
		 */

		LibraryDao libraryDao = new LibraryDao();
		// libraryDao.saveLibrary(marvat);

		/*
		 * BookDTO halfGf=new BookDTO(); halfGf.setName("Half Gf");
		 * halfGf.setAuthor("Chetan Bhagat"); halfGf.setPrice(250);
		 * halfGf.setLibrary(marvat);
		 * 
		 * 
		 * BookDTO theAlchemist=new BookDTO(); theAlchemist.setName("the Alchemist");
		 * theAlchemist.setAuthor("Paulo Coehlo"); theAlchemist.setPrice(170);
		 * theAlchemist.setLibrary(marvat);
		 * 
		 * 
		 * BookDTO richDadpoorDad=new BookDTO();
		 * richDadpoorDad.setName("Rich Dad and Poor Dad");
		 * richDadpoorDad.setAuthor("robert"); richDadpoorDad.setPrice(190);
		 * richDadpoorDad.setLibrary(marvat);
		 * 
		 * 
		 * List<BookDTO> bookList = new ArrayList<>(); bookList.add(halfGf);
		 * bookList.add(theAlchemist); bookList.add(richDadpoorDad);
		 * 
		 * libraryDao.saveLibraryAndBooks(marvat,bookList);
		 * 
		 */

		
		
		
		
		 libraryDao.getLibraryById(1);

		
		
		
		
		
		
		
		/*LibraryDTO dto = new LibraryDTO();
		dto.setId(1);
		dto.setName("Ajanta");
		dto.setLocation("Mumbai");

		libraryDao.updateLibrary(dto);*/

	}
}
