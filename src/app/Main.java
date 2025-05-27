package app;

import java.util.Scanner;

import model.Book;
import repository.LibraryRepository;
import repository.LoanRepository;
import service.ImpLibraryServices;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ImpLibraryServices service = new ImpLibraryServices(new LibraryRepository(), new LoanRepository());
		
		while(true){
			System.out.println("\n Olá, Tem cadastro? (s/n)");
			
			String option = sc.next();
			sc.nextLine();
			
			if(option.toLowerCase() == "s") {
				String name = sc.next();
				String name = 
			}
				
		}
			
			
		
		sc.close();
		
 
	}

}
