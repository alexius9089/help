/*
Modificate la classe in Help2 per fare in modo d'includere la spiegazione anche dei comandi for, while, do-while, break.
Inoltre, fare in modo che il programma venga eseguito costantemente fino a quando l'utente preme la lettera q.
*/
class Help2 { 
  public static void main(String args[])  
  throws java.io.IOException { 
    char choice;
    do {
 	  System.out.println("Help on:"); 
      System.out.println("  1. if"); 
      System.out.println("  2. switch");
      System.out.println("  3. for");
      System.out.println("  4. while");
      System.out.println("  5. do-while");
      System.out.println("  q. quit");
      System.out.print("Choose one: ");
      do {
        choice = (char) System.in.read();
      } while(choice=='\n'|choice=='\r');
      System.out.println("\n"); 
      switch(choice) { 
      case '1': 
        System.out.println("The if:\n"); 
        System.out.println("if(condition) statement;"); 
        System.out.println("else statement;"); 
        break; 
      case '2': 
        System.out.println("The switch:\n"); 
        System.out.println("switch(expression) {"); 
        System.out.println("  case constant:"); 
        System.out.println("    statement sequence"); 
        System.out.println("    break;"); 
        System.out.println("  // ..."); 
        System.out.println("}"); 
        break;
      case 'q': 
        System.out.println("Exiting program...");
        break;
      default: 
        System.out.print("Selection not found.");
      } 
	} while(choice!='q');
  } 
}
