package app;

import java.util.Scanner;

import model.Book;

import repository.LibraryRepository;

import service.ImpLibraryServices;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LibraryRepository repository = new LibraryRepository();
		ImpLibraryServices service = new ImpLibraryServices(repository);
		
		while(true){
			System.out.println("\nO que deseja fazer?");
			System.out.println(
					"1: Cadastrar Livro\n" +
					"2: Remover Livro\n" +
					"3: Listar Livros\n" +
					"4: Sair\n"
					
			);
			
			int option = sc.nextInt();
			sc.nextLine();
			
			if(option == 1) {
				System.out.print("Digite o nome do livro: ");
				String nameBook = sc.nextLine();
				
				System.out.print("Digite o nome do autor: ");
				String autorBook = sc.nextLine();
				
				Book book = new Book(nameBook, autorBook);
				service.registerBook(book);
				
			}
			
			if(option == 3) {
				service.listAvailableBooks();
				
			}
			
			if(option == 4) {
				break;
			}
		}
		
		sc.close();
		
 
	}

}
