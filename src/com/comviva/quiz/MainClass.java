package com.comviva.quiz;

public class MainClass extends ShowQuiz {
	
	public static void main(String[] args)  {
		
		  //Quetions.questions();
		    
		    System.out.println();
			System.out.println("-------------------------Welcome To Quiz Comppit --------------------------");
			System.out.println();
			
			System.out.println("Plz Enter Your Name");
			name = sc.nextLine();
			System.out.println();
			
			System.out.println("Enter id");
			
		    id1 = sc.nextInt();
		    
		    System.out.println();
			Quetions.getMark();
			
			Checke_Id.getDuplicateId();
			
			System.out.println("===============================================================================");
			System.out.println();
			System.out.println("YOUR QUIZ COMMPITETION WILL BE START IN WHILE PLZ BE PREPPER - [ BEST OF LUCK ]");
			System.out.println();
			
			ShowQuiz.showQuestions1();
			ShowQuiz.showQuestions2();
			ShowQuiz.showQuestions3();
			ShowQuiz.showQuestions4();
			ShowQuiz.showQuestions5();
			ShowQuiz.showQuestions6();
			ShowQuiz.showQuestions7();
			ShowQuiz.showQuestions8();
			ShowQuiz.showQuestions9();
			ShowQuiz.showQuestions10();
          Quetions.markSheet(id1, name, mark);
			ShowQuiz.displayMarkSheet();
			ShowQuiz.retriveMarksheet(id1);		
	
	}
}
	

