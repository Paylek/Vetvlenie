package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_21 {

	public static void main(String[] args) {
		  
		  String temp;
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Кто ты: мальчик или девочка? Введи Д или М: ");
		  
		  /*
		   
		  String input = sc.nextLine();
		  
		 
		  while(!(input.equalsIgnoreCase("Д") || input.equalsIgnoreCase("М"))) {
		   
		   System.out.print("Допустимые значения - Д или М. Попробуй еще раз. Введи Д или М: ");
		   
		   sc.next();
		   
		   
		  }
		  
		  */

		  
		  temp = sc.nextLine();
		  
		  
		  String answer;
		  
		  answer = temp.toLowerCase();
		  
		  sc.close();
		  
		  
		  
		  switch(answer) {
		  
		  case "д":
		   System.out.print("Мне нравятся девочки!");
		   break;
		   
		  case "м":
		   System.out.print("Мне нравятся мальчики!");
		   break;
		   
		  default:
		   System.out.print("Введено неверное значение");
		   
		  }
		  
		  }

}